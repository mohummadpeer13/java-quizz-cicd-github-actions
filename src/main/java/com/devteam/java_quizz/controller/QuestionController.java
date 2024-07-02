package com.devteam.java_quizz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devteam.java_quizz.entity.Question;
import com.devteam.java_quizz.service.QuestionService;

@RestController
@RequestMapping("questions")
public class QuestionController {
    
    @Autowired
    QuestionService questionService;

    @GetMapping()
    public List<Question> getAllQuestions(){
        return this.questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return this.questionService.getQuestionsByCategory(category);
    }

    @PostMapping()
    public String addQuestion(@RequestBody Question question){
        this.questionService.addQuestion(question);
        return "success";
    }
}
