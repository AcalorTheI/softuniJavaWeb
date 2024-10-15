package com.example.Spring.Boot.exercise.MVC.dto;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationFormDto {
    private String username;
    private String fullname;

    @Email
    private String email;
    private int age;
    private String password;
    private String confirmPassword;
}