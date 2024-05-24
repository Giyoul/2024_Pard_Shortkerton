package com.example.giyoungpyoryugi.config.letter.dto;

import com.example.giyoungpyoryugi.config.letter.entity.Letter;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LetterReadDTO extends Letter {
    private Long letterId;
    private String letterContents;
    private String letterTitle;
    private String letterDate;

    public LetterReadDTO(Letter letter) {
        this.letterId = letter.getLetterId();
        this.letterContents = letter.getLetterContents();
        this.letterTitle = letter.getLetterTitle();
        this.letterDate = letter.getLetterDate();
    }

    public LetterReadDTO(String letterContents, String letterTitle, String letterDate) {
        this.letterContents = letterContents;
        this.letterTitle = letterTitle;
        this.letterDate = letterDate;
    }
}
