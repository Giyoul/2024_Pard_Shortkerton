package com.example.giyoungpyoryugi.config.user.dto;

import com.example.giyoungpyoryugi.config.letter.dto.LetterReadDTO;
import com.example.giyoungpyoryugi.config.letter.entity.Letter;
import com.example.giyoungpyoryugi.config.question.dto.QuestionReadDTO;
import com.example.giyoungpyoryugi.config.question.entity.Question;
import com.example.giyoungpyoryugi.config.questionanswer.dto.QuestionAnswerReadDTO;
import com.example.giyoungpyoryugi.config.questionanswer.entity.QuestionAnswer;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)

public class UserWriteDTO {
    private Question questionReadDTO;
    private QuestionAnswer questionAnswerReadDTO;
    private Letter letterReadDTO;

    public UserWriteDTO(Question questionReadDTO, QuestionAnswer questionAnswerReadDTO, Letter letterReadDTO) {
        this.questionReadDTO = questionReadDTO;
        this.questionAnswerReadDTO = questionAnswerReadDTO;
        this.letterReadDTO = letterReadDTO;
    }

}
