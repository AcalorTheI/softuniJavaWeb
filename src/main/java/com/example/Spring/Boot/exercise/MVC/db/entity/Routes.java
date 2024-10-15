package com.example.Spring.Boot.exercise.MVC.db.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "routes")
public class Routes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "gpx_coordinates", columnDefinition = "MEDIUMTEXT")
    private String gpxCoordinates;

    @Column(name = "description", columnDefinition = "MEDIUMTEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    private UserLevel level;

    private String name;

    private String videoUrl;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Users user;


    @ManyToMany
    @JoinTable(name = "routes_categories", joinColumns = @JoinColumn(name = "category_id"), inverseJoinColumns = @JoinColumn(name = "route_id"))
    private Set<Category> categories;
}
