package com.example.giyoungpyoryugi.config.user.controller;

import com.example.giyoungpyoryugi.config.QuestionList;
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
    QuestionList questionList = new QuestionList();

    @GetMapping("/mypage")
    @Operation(summary = "유저 데이터 보내주기", description = "D-day, 쓸 편지 개수, 쓴 편지 내용을 보내줍니다.")
    public UserReadDTO readUser(){
        return userService.findById(1);
    }

    @GetMapping("/mypage/listall")
    @Operation(summary = "유저가 쓴 편지들 보내주기", description = "쓴 편지 내용을 보내줍니다.")
    public UserReadDTO readAllUser(){
        return userService.findById(1);
    }



    @PostMapping("/initial")
    @Operation(summary = "초기 정보 세팅하기", description = "D-day, 쓸 편지 개수, 받으실 분 성함, 받으실 분 주소, 받으실 분 전화번호를 받아옵니다.")
    public String createUser(@RequestBody UserCreateDTO userCreateDTO) {
        userService.createUser(userCreateDTO);
        return "User Create Success";
    }

    @GetMapping("/mypage/letterwrite")
    @Operation(summary = "두 개의 랜덤 질문을 보내주기", description = "두개의 랜덤 질문을 뽑아서 스트링 리스트로 보내줍니다.")
    public List<String> getTwoQuestion(){
        return questionList.pickRandomQuestion();
    }

    @PostMapping("/mypage/letterwrite")
    @Operation(summary = "편지쓰기", description = "질문에 대한 답 두개, 질문 두개, 편지 본문 내용 두개를 받아옵니다.")
    public String createLetter(@RequestBody UserWriteDTO userWriteDTO){
        userService.addUserLetter(1, userWriteDTO);
        return "User Letter Add Success";
    }
}
