package com.example.Spring.Boot.exercise.MVC.db.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean approved;

    @Column(name = "text_content", columnDefinition = "TEXT")
    private String textContent;


    private LocalDateTime created;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Routes routes;
}
