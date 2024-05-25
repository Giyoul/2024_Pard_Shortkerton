package com.example.giyoungpyoryugi.config.user.entity;

import com.example.giyoungpyoryugi.config.letter.dto.LetterReadDTO;
import com.example.giyoungpyoryugi.config.letter.entity.Letter;
import com.example.giyoungpyoryugi.config.question.dto.QuestionReadDTO;
import com.example.giyoungpyoryugi.config.question.entity.Question;
import com.example.giyoungpyoryugi.config.questionanswer.dto.QuestionAnswerReadDTO;
import com.example.giyoungpyoryugi.config.questionanswer.entity.QuestionAnswer;
import com.example.giyoungpyoryugi.config.user.dto.UserCreateDTO;
import com.example.giyoungpyoryugi.config.user.dto.UserLetterDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @ColumnDefault("10")
    private int userDDay;

    @ColumnDefault("10")
    private int userLetterCount;


    @ColumnDefault("'박준현'")
    private String userName;

    @ColumnDefault("'아빠'")
    private String userRecevier;

    @ColumnDefault("'한동대학교'")
    private String userRecevierAddress;

    @ColumnDefault("'010-1234-5678'")
    private String userRecevierPhoneNumber;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Letter> userWroteLetter = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Question> userQuestion = new ArrayList<>();


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuestionAnswer> userQuestionAnswer = new ArrayList<>();


    public User toEntity(UserCreateDTO dto){
        return User.builder()
                .userDDay(dto.getUserDDay())
                .userLetterCount(dto.getUserLetterCount())
                .userName(dto.getUserName())
                .userRecevier(dto.getUserRecevier())
                .userRecevierAddress(dto.getUserRecevierAddress())
                .userRecevierPhoneNumber(dto.getUserRecevierPhoneNumber())
                .build();
    }

}
