package com.example.giyoungpyoryugi.config.user.repo;

import com.example.giyoungpyoryugi.config.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
