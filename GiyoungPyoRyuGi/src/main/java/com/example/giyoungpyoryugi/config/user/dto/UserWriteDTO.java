package com.example.giyoungpyoryugi.config.user.dto;

import com.example.giyoungpyoryugi.config.letter.dto.LetterReadDTO;
import com.example.giyoungpyoryugi.config.question.dto.QuestionReadDTO;
import com.example.giyoungpyoryugi.config.questionanswer.dto.QuestionAnswerReadDTO;

import java.util.List;

public class UserWriteDTO {
    private List<QuestionReadDTO> questionReadDTO;
    private List<QuestionAnswerReadDTO> questionAnswerReadDTO;
    private List<LetterReadDTO> letterReadDTO;

    public UserWriteDTO(List<QuestionReadDTO> questionReadDTO, List<QuestionAnswerReadDTO> questionAnswerReadDTO, List<LetterReadDTO> letterReadDTO) {
        this.questionReadDTO = questionReadDTO;
        this.questionAnswerReadDTO = questionAnswerReadDTO;
        this.letterReadDTO = letterReadDTO;
    }

}
