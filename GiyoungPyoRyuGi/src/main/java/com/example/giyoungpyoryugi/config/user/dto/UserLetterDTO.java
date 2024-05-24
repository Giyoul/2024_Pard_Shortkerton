package com.example.giyoungpyoryugi.config.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLetterDTO {

    //private Long letterId;
    private String letterContents;
    private String letterTitle;
    private String letterDate;

    //private Long questionId;
    private String question1;
    private String question2;

    //private Long questionAnswerId;
    private String questionAnswer1;
    private String questionAnswer2;
}
