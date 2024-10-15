package com.example.Spring.Boot.exercise.MVC.db.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pictures")
@Builder
public class Pictures {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Routes routes;
}
