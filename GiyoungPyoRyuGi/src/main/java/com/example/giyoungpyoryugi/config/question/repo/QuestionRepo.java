package com.example.giyoungpyoryugi.config.question.repo;

import com.example.giyoungpyoryugi.config.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Question, Long> {
}
