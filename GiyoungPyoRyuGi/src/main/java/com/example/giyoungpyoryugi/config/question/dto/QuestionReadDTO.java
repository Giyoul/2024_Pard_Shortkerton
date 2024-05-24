package com.example.giyoungpyoryugi.config.question.dto;

import com.example.giyoungpyoryugi.config.question.entity.Question;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuestionReadDTO {
    private Long questionId;
    private String question1;
    private String question2;

    public QuestionReadDTO(Question question) {
        this.questionId = question.getQuestionId();
        this.question1 = question.getQuestion1();
        this.question2 = question.getQuestion2();
    }
}
