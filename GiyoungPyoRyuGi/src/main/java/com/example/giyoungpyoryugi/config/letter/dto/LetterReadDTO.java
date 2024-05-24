package com.example.giyoungpyoryugi.config.letter.dto;

import com.example.giyoungpyoryugi.config.letter.entity.Letter;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LetterReadDTO {
    private Long letterId;
    private String letterContents;
    private String letterTitle;
    private String letterDate;
    private Integer letterEmoticon;

    public LetterReadDTO(Letter letter) {
        this.letterId = letter.getLetterId();
        this.letterContents = letter.getLetterContents();
        this.letterTitle = letter.getLetterTitle();
        this.letterDate = letter.getLetterDate();
        this.letterEmoticon = letter.getLetterEmoticon();
    }
}
