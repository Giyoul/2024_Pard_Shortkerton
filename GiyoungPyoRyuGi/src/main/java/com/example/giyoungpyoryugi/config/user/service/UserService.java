package com.example.giyoungpyoryugi.config.user.service;

import com.example.giyoungpyoryugi.config.user.dto.UserCreateDTO;
import com.example.giyoungpyoryugi.config.user.entity.User;
import com.example.giyoungpyoryugi.config.user.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public void createUser(UserCreateDTO userCreateDTO) {
        userRepo.save(User.toEntity(userCreateDTO));
    }
    /*public void findAll(){
        return userRepo.findAll()
                .stream()

    }*/


}
