package com.nailton.apiquestion.controller;

import com.nailton.apiquestion.model.Question;
import com.nailton.apiquestion.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping(
            value = "/cadastrar",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> insertQuestion(@RequestBody Question question) {
        try {
            this.questionService.insertQuestion(question);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Question/created");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Erro/no/servidor");
        }
    }

    @GetMapping(value = "/questions")
    public ResponseEntity<List<Question>> listQuestions() {
        try {
            List<Question> q = this.questionService.listQuestions();
            return ResponseEntity.status(HttpStatus.OK).body(q);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
