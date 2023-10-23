package com.eduapp.v1.user.controller;

import com.eduapp.v1.user.entities.User;
import com.eduapp.v1.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(value = "api/v1/users")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Create a User
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }


    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("{user_id}")
    public Optional<User>  getUser(@PathVariable("user_id") Long userId){
        return userService.getUserById(userId);
    }

    @DeleteMapping("/delete/{user_id}")
    public boolean deleteUser(@PathVariable("user_id") Long id) {
        return userService.deleteUserById(id);
    }

    @PutMapping
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

}
