package com.example.giyoungpyoryugi.config.user.service;

import com.example.giyoungpyoryugi.config.letter.dto.LetterCreateDTO;
import com.example.giyoungpyoryugi.config.letter.dto.LetterReadDTO;
import com.example.giyoungpyoryugi.config.letter.entity.Letter;
import com.example.giyoungpyoryugi.config.letter.repo.LetterRepo;
import com.example.giyoungpyoryugi.config.question.dto.QuestionReadDTO;
import com.example.giyoungpyoryugi.config.question.entity.Question;
import com.example.giyoungpyoryugi.config.question.repo.QuestionRepo;
import com.example.giyoungpyoryugi.config.questionanswer.dto.QuestionAnswerReadDTO;
import com.example.giyoungpyoryugi.config.questionanswer.entity.QuestionAnswer;
import com.example.giyoungpyoryugi.config.questionanswer.repo.QuestionAnswerRepo;
import com.example.giyoungpyoryugi.config.user.dto.UserCreateDTO;
import com.example.giyoungpyoryugi.config.user.dto.UserLetterDTO;
import com.example.giyoungpyoryugi.config.user.dto.UserReadDTO;
import com.example.giyoungpyoryugi.config.user.entity.User;
import com.example.giyoungpyoryugi.config.user.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    private final LetterRepo letterRepo;
    private final QuestionRepo questionRepo;
    private final QuestionAnswerRepo questionAnswerRepo;


    public void createUser(UserCreateDTO userCreateDTO) {
        userRepo.save(new User().toEntity(userCreateDTO));
    }

    public List<UserReadDTO> findAll() {
        return userRepo.findAll()
                .stream()
                .map(user -> new UserReadDTO(
                        user,
                        user.getUserQuestion().stream()
                                .map(QuestionReadDTO::new)
                                .collect(Collectors.toList()),
                        user.getUserQuestionAnswer().stream()
                                .map(QuestionAnswerReadDTO::new)
                                .collect(Collectors.toList()),
                        user.getUserWroteLetter().stream()
                                .map(LetterReadDTO::new)
                                .collect(Collectors.toList())
                ))
                .collect(Collectors.toList());
    }

    public UserReadDTO findById(int id) {
        User user = userRepo.findById((long) id).orElseThrow();
        return new UserReadDTO(
                user,
                user.getUserQuestion().stream()
                        .map(QuestionReadDTO::new)
                        .collect(Collectors.toList()),
                user.getUserQuestionAnswer().stream()
                        .map(QuestionAnswerReadDTO::new)
                        .collect(Collectors.toList()),
                user.getUserWroteLetter().stream()
                        .map(LetterReadDTO::new)
                        .collect(Collectors.toList()));
    }

    public void addUserLetter(int id, UserLetterDTO userLetterDTO){
        User user = userRepo.findById((long) id).orElseThrow();
        Letter letter = Letter.builder()
                .letterContents(userLetterDTO.getLetterContents())
                .letterTitle(userLetterDTO.getLetterTitle())
                .letterDate(userLetterDTO.getLetterDate())
                .user(user)  // 사용자 ID를 1로 고정
                .build();
        letterRepo.save(letter);
        /*letterRepo.save(Letter.toEntity(userLetterDTO.getLetterContents(),
                userLetterDTO.getLetterTitle(),
                userLetterDTO.getLetterDate()));*/
        Question question = Question.toEntity(userLetterDTO.getQuestion1(), userLetterDTO.getQuestion2());
        question.setUser(user); // 사용자 ID를 1로 고정
        questionRepo.save(question);

        /*questionRepo.save(Question.toEntity(userLetterDTO.getQuestion1(),
                userLetterDTO.getQuestion2()));*/
        QuestionAnswer questionAnswer = QuestionAnswer.toEntity(userLetterDTO.getQuestionAnswer1(), userLetterDTO.getQuestionAnswer2());
        questionAnswer.setUser(user); // 사용자 ID를 1로 고정
        questionAnswerRepo.save(questionAnswer);

        /*questionAnswerRepo.save(QuestionAnswer.toEntity(userLetterDTO.getQuestionAnswer1(),
                userLetterDTO.getQuestionAnswer2()));*/
    }

}
