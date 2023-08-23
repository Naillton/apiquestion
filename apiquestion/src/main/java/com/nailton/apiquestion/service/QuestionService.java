package com.nailton.apiquestion.service;

import com.nailton.apiquestion.model.Question;
import com.nailton.apiquestion.repository.QuestionRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public void insertQuestion(Question question) {
        this.questionRepository.save(question);
    }

    public List<Question> listQuestions() {
        return this.questionRepository.findAll();
    }
}
