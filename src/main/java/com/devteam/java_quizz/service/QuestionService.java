package com.devteam.java_quizz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devteam.java_quizz.dao.QuestionDao;
import com.devteam.java_quizz.entity.Question;

@Service
public class QuestionService {
    
    @Autowired
    QuestionDao questionDao;
    
    public List<Question> getAllQuestions() {
        return this.questionDao.findAll();
    }
    
}
