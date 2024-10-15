package com.example.Spring.Boot.exercise.MVC.db.repository;

import com.example.Spring.Boot.exercise.MVC.db.entity.Routes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutesRepository extends CrudRepository<Routes, Long> {
}
