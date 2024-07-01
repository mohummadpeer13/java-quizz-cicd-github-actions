package com.devteam.java_quizz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devteam.java_quizz.entity.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer>{
   
}
