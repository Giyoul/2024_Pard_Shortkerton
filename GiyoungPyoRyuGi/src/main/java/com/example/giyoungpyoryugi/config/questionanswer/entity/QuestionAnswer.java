package com.example.giyoungpyoryugi.config.questionanswer.entity;

import com.example.giyoungpyoryugi.config.questionanswer.dto.QuestionAnswerCreateDTO;
import com.example.giyoungpyoryugi.config.questionanswer.dto.QuestionAnswerReadDTO;
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
public class QuestionAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionAnswerId;
    private String questionAnswer1;
    private String questionAnswer2;

    @ManyToOne
    @JoinColumn(nullable = false, name = "user_id")
    User user;

    public static QuestionAnswer toEntity(QuestionAnswerCreateDTO questionAnswerCreateDTO) {
        return QuestionAnswer.builder()
                .questionAnswer1(questionAnswerCreateDTO.getQuestionAnswer1())
                .questionAnswer2(questionAnswerCreateDTO.getQuestionAnswer2())
                .build();
    }
}
