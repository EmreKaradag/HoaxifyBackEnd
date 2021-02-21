package com.hoaxify.wsservice.controller;

import com.hoaxify.wsservice.entity.User;
import com.hoaxify.wsservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/api/1.0/users")
    public ResponseEntity createUser(@RequestBody User user){
        log.info(user.toString());
        userRepository.save(user);
        return ResponseEntity.ok(user);
    }

}
