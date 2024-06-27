package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ExampleUser createUser(@RequestBody ExampleUser user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public ExampleUser getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }
}
