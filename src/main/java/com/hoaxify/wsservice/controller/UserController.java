package com.hoaxify.wsservice.controller;

import com.hoaxify.wsservice.entity.User;
import com.hoaxify.wsservice.service.UserService;
import com.hoaxify.wsservice.shared.GenericResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/api/1.0/users")
    public GenericResponse createUser(@RequestBody User user){
        log.info(user.toString());
        userService.save(user);
        log.info("User Create : {}", user.getDisplayName());
        return  new GenericResponse("User Created Success");
    }

}
