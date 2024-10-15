package com.example.Spring.Boot.exercise.MVC.db.repository;

import com.example.Spring.Boot.exercise.MVC.db.entity.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends CrudRepository<Comments, Long> {
}
