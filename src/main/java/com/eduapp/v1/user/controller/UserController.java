package com.eduapp.v1.user.controller;

import com.eduapp.v1.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1")
public class UserController {

    UserService userService;


    // login
    @PostMapping("/login")
    public String login() {
        userService.login();
    }
    // register
    // logout
    // TODO: verify access token
    // TODO: refresh token


}
