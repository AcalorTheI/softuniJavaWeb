package com.example.Spring.Boot.exercise.MVC.services;

import com.example.Spring.Boot.exercise.MVC.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void login() {
        // Implementiracemo kasnije
    }

    public void register() {
        // Implementiracemo kasnije
    }

}
