package com.nailton.apiquestion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @Column(name = "id")
    private final UUID id;

    @Column(name = "question")
    private String question;

    @Column(name = "response1")
    private String response1;

    @Column(name = "response2")
    private String response2;

    @Column(name = "response3")
    private String response3;

    @Column(name = "correct")
    private String correct;

    public Question() {
        this.id = UUID.randomUUID();
    }

    public Question(String question, String response1, String response2, String response3, String correct) {
        this.id = UUID.randomUUID();
        this.question = question;
        this.response1 = response1;
        this.response2 = response2;
        this.response3 = response3;
        this.correct = correct;
    }

    public UUID getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getResponse1() {
        return response1;
    }

    public void setResponse1(String response1) {
        this.response1 = response1;
    }

    public String getResponse2() {
        return response2;
    }

    public void setResponse2(String response2) {
        this.response2 = response2;
    }

    public String getResponse3() {
        return response3;
    }

    public void setResponse3(String response3) {
        this.response3 = response3;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }
}
