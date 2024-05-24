package com.example.giyoungpyoryugi.config.question.service;

import com.example.giyoungpyoryugi.config.question.dto.QuestionCreateDTO;
import com.example.giyoungpyoryugi.config.question.entity.Question;
import com.example.giyoungpyoryugi.config.question.repo.QuestionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepo questionRepo;

    public void createQuestion(QuestionCreateDTO questionCreateDTO) {
        questionRepo.save(Question.toEntity(questionCreateDTO));
    }
}
