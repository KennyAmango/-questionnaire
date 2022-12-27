package com.example.questionnaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.questionnaire.entity.Questions;

@Repository
public interface QuestionsDao extends JpaRepository<Questions, Integer>{
	

}