package com.example.giyoungpyoryugi.config.user.controller;

import com.example.giyoungpyoryugi.config.letter.service.LetterService;
import com.example.giyoungpyoryugi.config.question.service.QuestionService;
import com.example.giyoungpyoryugi.config.questionanswer.service.QuestionAnswerService;
import com.example.giyoungpyoryugi.config.user.dto.UserCreateDTO;
import com.example.giyoungpyoryugi.config.user.dto.UserReadDTO;
import com.example.giyoungpyoryugi.config.user.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final LetterService letterService;
    private final QuestionService questionService;
    private final QuestionAnswerService questionAnswerService;
    private final UserService userService;

    @GetMapping("/mypage/{id}")
    @Operation(summary = "유저 데이터 보내주기", description = "D-day, 쓸 편지 개수, 쓴 편지 내용을 보내줍니다.")
    public UserReadDTO readUser(@PathVariable Long id){
        return userService.findById(id);
    }



    @PostMapping("/initial")
    @Operation(summary = "초기 정보 세팅하기", description = "D-day, 쓸 편지 개수, 받으실 분 성함, 받으실 분 주소, 받으실 분 전화번호를 받아옵니다.")
    public String createUser(@RequestBody UserCreateDTO userCreateDTO) {
        userService.createUser(userCreateDTO);
        return "User Create Success";
    }

//    @PostMapping("/mypage/letterwrite")
//    @Operation(summary = "편지쓰기", description = "질문에 대한 답 두개, 질문 두개, 편지 본문 내용 두개를 받아옵니다.")
//    public String createLetter(@RequestBody )
}
