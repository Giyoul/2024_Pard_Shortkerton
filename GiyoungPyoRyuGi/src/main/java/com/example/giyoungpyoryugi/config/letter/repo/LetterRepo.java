package com.example.giyoungpyoryugi.config.letter.repo;

import com.example.giyoungpyoryugi.config.letter.entity.Letter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LetterRepo extends JpaRepository<Letter, Long> {
}
