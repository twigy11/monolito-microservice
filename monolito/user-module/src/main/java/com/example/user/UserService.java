package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public ExampleUser createUser(ExampleUser user) {
        return userRepository.save(user);
    }

    public ExampleUser getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
