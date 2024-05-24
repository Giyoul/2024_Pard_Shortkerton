package com.example.giyoungpyoryugi.config.user.dto;

import com.example.giyoungpyoryugi.config.letter.dto.LetterReadDTO;
import com.example.giyoungpyoryugi.config.question.dto.QuestionReadDTO;
import com.example.giyoungpyoryugi.config.questionanswer.dto.QuestionAnswerReadDTO;
import com.example.giyoungpyoryugi.config.user.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)

public class UserReadDTO {
    private long userId;
    private int userDDay;
    private int userLetterCount;
    private String userName;
    private String userRecevier;
    private String userRecevierAddress;
    private String userRecevierPhoneNumber;
    private List<QuestionReadDTO> questionReadDTO;
    private List<QuestionAnswerReadDTO> questionAnswerReadDTO;
    private List<LetterReadDTO> letterReadDTO;

    public UserReadDTO(User user){
        this.userId = user.getUserId();
        this.userDDay = user.getUserDDay();
        this.userLetterCount = user.getUserLetterCount();
        this.userRecevier = user.getUserRecevier();
        this.userRecevierAddress = user.getUserRecevierAddress();
        this.userRecevierPhoneNumber = user.getUserRecevierPhoneNumber();
    }

    public UserReadDTO(User user, List<QuestionReadDTO> questionReadDTO, List<QuestionAnswerReadDTO> questionAnswerDTO,
                       List<LetterReadDTO> letterReadDTO){
        this.userId = user.getUserId();
        this.userDDay = user.getUserDDay();
        this.userLetterCount = user.getUserLetterCount();
        this.userRecevier = user.getUserRecevier();
        this.userRecevierAddress = user.getUserRecevierAddress();
        this.userRecevierPhoneNumber = user.getUserRecevierPhoneNumber();

        this.questionReadDTO = questionReadDTO;
        this.questionAnswerReadDTO = questionAnswerDTO;
        this.letterReadDTO = letterReadDTO;
    }

}
