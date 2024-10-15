package com.example.Spring.Boot.exercise.MVC.db.repository;

import com.example.Spring.Boot.exercise.MVC.db.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
}
