package com.example.Spring.Boot.exercise.MVC.db.repository;

import com.example.Spring.Boot.exercise.MVC.db.entity.Messages;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends CrudRepository<Messages, Long> {
}
