package com.example.QuestionService.repository;

import com.example.QuestionService.model.questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface questionrepo extends JpaRepository<questions,Integer> {
}
