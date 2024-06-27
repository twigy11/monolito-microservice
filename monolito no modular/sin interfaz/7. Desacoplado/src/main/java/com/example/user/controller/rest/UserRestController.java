package com.example.user.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.user.application.UserService;
import com.example.user.infraestructure.jpa.UserJpaEntity;

@RestController
@RequestMapping("/users")
public class UserRestController {
    @Autowired
    private UserService userService;

    @PostMapping
    public UserJpaEntity createUser(@RequestBody UserJpaEntity user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public UserJpaEntity getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }
}
