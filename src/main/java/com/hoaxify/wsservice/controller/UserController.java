package com.hoaxify.wsservice.controller;

import com.hoaxify.wsservice.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @PostMapping("/api/1.0/users")
    public void createUser(@RequestBody User user){
        log.info(user.toString());
    }

}
