package com.anshuman265.quizApp.dao;


import com.anshuman265.quizApp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
// Data object which will be used to retrrive the question
@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {
    List<Question> findByCategory(String category);
}
