package com.example.QuestionService.service;

import com.example.QuestionService.model.questions;
import com.example.QuestionService.repository.questionrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class questionservice {
    @Autowired
    private questionrepo qrepo;
    public questions addQuestion(questions question) {
        return qrepo.save(question);
    }

    public questions addquestions(questions question) {
        return question;
    }
}