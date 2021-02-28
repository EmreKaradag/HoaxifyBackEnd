package com.hoaxify.wsservice.service;

import com.hoaxify.wsservice.entity.User;
import com.hoaxify.wsservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    UserRepository userRepository;

    PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public void save(User user) {
        String encryptedPassword = this.passwordEncoder.encode(user.getPassword());
        user.setPassword(encryptedPassword);
        userRepository.save(user);
        log.info("User Save Complated.");

    }
}
