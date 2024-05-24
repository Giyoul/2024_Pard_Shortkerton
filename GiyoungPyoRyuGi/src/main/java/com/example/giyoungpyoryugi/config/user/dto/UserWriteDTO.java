package com.example.giyoungpyoryugi.config.user.dto;

import com.example.giyoungpyoryugi.config.letter.dto.LetterReadDTO;
import com.example.giyoungpyoryugi.config.question.dto.QuestionReadDTO;
import com.example.giyoungpyoryugi.config.questionanswer.dto.QuestionAnswerReadDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)

public class UserWriteDTO {
    private String questionReadDTO;
    private String questionAnswerReadDTO;
    private String letterReadDTO;

    public UserWriteDTO(String questionReadDTO, String questionAnswerReadDTO, String letterReadDTO) {
        this.questionReadDTO = questionReadDTO;
        this.questionAnswerReadDTO = questionAnswerReadDTO;
        this.letterReadDTO = letterReadDTO;
    }

}
