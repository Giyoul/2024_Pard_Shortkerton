package com.example.giyoungpyoryugi.config.letter.service;

import com.example.giyoungpyoryugi.config.letter.dto.LetterCreateDTO;
import com.example.giyoungpyoryugi.config.letter.entity.Letter;
import com.example.giyoungpyoryugi.config.letter.repo.LetterRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LetterService {
    private final LetterRepo letterRepo;

    public void createLetter(LetterCreateDTO letterCreateDTO) {
        letterRepo.save(Letter.toEntity(letterCreateDTO));
    }
}
