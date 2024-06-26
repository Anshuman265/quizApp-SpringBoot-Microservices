package com.anshuman265.quizApp.controller;


import com.anshuman265.quizApp.model.Question;
import com.anshuman265.quizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;


    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{cat}")
    public List<Question> getQuestionsByCategory(@PathVariable("cat") String category){
        return questionService.getQuestionsByCategory(category);
    }
    // Service to add new records in the database
    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }

}
