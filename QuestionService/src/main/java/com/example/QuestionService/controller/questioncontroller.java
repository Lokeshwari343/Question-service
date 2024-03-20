package com.example.QuestionService.controller;

import com.example.QuestionService.model.questions;
import com.example.QuestionService.service.questionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class questioncontroller {
    @Autowired
    private questionservice qservice;

    @PostMapping
    public questions addQuestion(@RequestBody questions question){
        return qservice.addquestions(question);
    }
}
