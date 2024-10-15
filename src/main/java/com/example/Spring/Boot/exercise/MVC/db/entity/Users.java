package com.example.Spring.Boot.exercise.MVC.db.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int age;

    private String full_name;
    private String email;

    @Enumerated(EnumType.STRING)
    private UserLevel level;
    private String password;
    private String username;

    @ManyToMany
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "roles_id"))
    private List<Role> role;

    @OneToMany(mappedBy = "recipient")
    private List<Messages> recievedMessaged;

    @OneToMany(mappedBy = "author")
    private List<Messages> sentMessages;
}
