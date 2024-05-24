package com.example.giyoungpyoryugi.config.questionanswer.repo;

import com.example.giyoungpyoryugi.config.questionanswer.entity.QuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionAnswerRepo extends JpaRepository<QuestionAnswer, Long> {
}
