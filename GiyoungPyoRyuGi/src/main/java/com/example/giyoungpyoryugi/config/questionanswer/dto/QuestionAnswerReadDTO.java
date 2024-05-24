package com.example.giyoungpyoryugi.config.questionanswer.dto;

import com.example.giyoungpyoryugi.config.questionanswer.entity.QuestionAnswer;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuestionAnswerReadDTO extends QuestionAnswer {
    private Long questionAnswerId;
    private String questionAnswer1;
    private String questionAnswer2;

    public QuestionAnswerReadDTO(QuestionAnswer questionAnswer) {
        this.questionAnswerId = questionAnswer.getQuestionAnswerId();
        this.questionAnswer1 = questionAnswer.getQuestionAnswer1();
        this.questionAnswer2 = questionAnswer.getQuestionAnswer2();
    }

    public QuestionAnswerReadDTO(String questionAnswer1, String questionAnswer2) {
        this.questionAnswer1 = questionAnswer1;
        this.questionAnswer2 = questionAnswer2;
    }
}
