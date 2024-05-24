package com.example.giyoungpyoryugi.config.question.entity;

import com.example.giyoungpyoryugi.config.question.dto.QuestionReadDTO;
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
    @JoinColumn(nullable = false, name = "user_id")
    User user;

    public static Question toEntity(QuestionReadDTO questionReadDTO) {
        return Question.builder()
                .questionId(questionReadDTO.getQuestionId())
                .question1(questionReadDTO.getQuestion1())
                .question2(questionReadDTO.getQuestion2())
                .build();
    }
}
