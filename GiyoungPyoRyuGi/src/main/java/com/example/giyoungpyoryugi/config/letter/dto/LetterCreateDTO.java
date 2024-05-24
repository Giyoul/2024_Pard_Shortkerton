package com.example.giyoungpyoryugi.config.letter.dto;

import com.example.giyoungpyoryugi.config.letter.entity.Letter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LetterCreateDTO {
    private String letterContents;
    private String letterTitle;
    private String letterDate;
}
