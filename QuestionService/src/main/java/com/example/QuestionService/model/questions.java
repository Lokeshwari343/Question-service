package com.example.QuestionService.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class questions {
    @Id
    public int id;
    public String question;
    public String topic;
    public int points;
    @OneToMany(mappedBy = "question",cascade = CascadeType.ALL )
    public List<Answers> answers;
}

