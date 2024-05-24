package com.example.giyoungpyoryugi.config.user.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserCreateDTO {
    private int userDDay;
    private int userLetterCount;
    private String userName;
    private String userRecevier;
    private String userRecevierAddress;
    private String userRecevierPhoneNumber;
}
