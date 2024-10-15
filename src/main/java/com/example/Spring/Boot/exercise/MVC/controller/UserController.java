package com.example.Spring.Boot.exercise.MVC.controller;

import com.example.Spring.Boot.exercise.MVC.db.entity.Users;
import com.example.Spring.Boot.exercise.MVC.dto.LoginFormDto;
import com.example.Spring.Boot.exercise.MVC.dto.RegistrationFormDto;
import com.example.Spring.Boot.exercise.MVC.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showloginForm(Model model) {
        model.addAttribute("loginFormDto", new LoginFormDto());
        return "login";
    }

    @PostMapping("/login")
    public String submitLoginForm(@ModelAttribute LoginFormDto loginFormDto, Model model) {
        userService.login();


        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registerFormDto", new RegistrationFormDto());
        return "register";
    }

    @PostMapping("/register")
    public String submitRegistrationForm( @ModelAttribute RegistrationFormDto registrationForm, Model model) {
        // Handle the registration form submission logic here
        // For example, you can check the input data and save it to the database

        userService.register();

        model.addAttribute("message", "Registration successful");
        return "login";
    }


}
