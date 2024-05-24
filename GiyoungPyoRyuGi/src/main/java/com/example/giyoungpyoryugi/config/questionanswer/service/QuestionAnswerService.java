package com.example.giyoungpyoryugi.config.questionanswer.service;

import com.example.giyoungpyoryugi.config.questionanswer.dto.QuestionAnswerCreateDTO;
import com.example.giyoungpyoryugi.config.questionanswer.entity.QuestionAnswer;
import com.example.giyoungpyoryugi.config.questionanswer.repo.QuestionAnswerRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionAnswerService {
    private final QuestionAnswerRepo questionAnswerRepo;

    public void createQuestionAnswer(QuestionAnswerCreateDTO questionAnswerCreateDTO) {
        questionAnswerRepo.save(QuestionAnswer.toEntity(questionAnswerCreateDTO));
    }
}
