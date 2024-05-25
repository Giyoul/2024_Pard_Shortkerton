package com.example.giyoungpyoryugi.config.question.entity;

import com.example.giyoungpyoryugi.config.question.dto.QuestionCreateDTO;
import com.example.giyoungpyoryugi.config.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;
    private String question1;
    private String question2;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    public static Question toEntity(QuestionCreateDTO questionCreateDTO) {
        return Question.builder()
                .question1(questionCreateDTO.getQuestion1())
                .question2(questionCreateDTO.getQuestion2())
                .build();
    }
    public static Question toEntity(String question1, String question2) {
        return Question.builder()
                //.questionId(questionId)
                .question1(question1)
                .question2(question2)
                .build();
    }

    public void setUser(User user) {
        this.user = user;
    }
}
