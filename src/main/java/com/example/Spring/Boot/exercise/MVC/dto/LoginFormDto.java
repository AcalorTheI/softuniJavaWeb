package com.example.Spring.Boot.exercise.MVC.dto;

import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginFormDto {
    private String username;


    private String password;
}
