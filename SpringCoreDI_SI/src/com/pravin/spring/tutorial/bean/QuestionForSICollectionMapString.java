package com.pravin.spring.tutorial.bean;

import java.util.Map;

public class QuestionForSICollectionMapString {
    private int id;
    private String question;
    private Map<String, String> answers;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getQuestion() {
	return question;
    }

    public void setQuestion(String question) {
	this.question = question;
    }

    public Map<String, String> getAnswers() {
	return answers;
    }

    public void setAnswers(Map<String, String> answers) {
	this.answers = answers;
    }

    public void displayInfo() {
	System.out.println(id + "\t" + question);
	System.out.println("Answers are :: ");
	answers.forEach((key, value) -> {
	    System.out.println("Answer :: " + key + "\tPosted by :: " + value);
	});
    }
}
