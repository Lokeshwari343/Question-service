package com.example.QuestionService.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answers {
    @Id
    public int id;
    public String answer;
    public int isCorrect;
    public int points;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "question_id",referencedColumnName="id")
    public questions question;
}
