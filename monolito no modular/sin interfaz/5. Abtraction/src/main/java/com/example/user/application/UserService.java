package com.example.user.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.infraestructure.jpa.UserJpaEntity;
import com.example.user.infraestructure.jpa.UserJpaRepository;

@Service
public class UserService {
    @Autowired
    private UserJpaRepository userRepository;

    public UserJpaEntity createUser(UserJpaEntity user) {
        return userRepository.save(user);
    }

    public UserJpaEntity getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
