package com.pravin.spring.tutorial.bean;

import java.util.Map;

public class QuestionForSICollectionMapNonString {
    private int id;
    private String question;
    private Map<AnswerForSIMapCollectionNonString, UserForSIMapCollectionNonString> answers;

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

    public Map<AnswerForSIMapCollectionNonString, UserForSIMapCollectionNonString> getAnswers() {
	return answers;
    }

    public void setAnswers(Map<AnswerForSIMapCollectionNonString, UserForSIMapCollectionNonString> answers) {
	this.answers = answers;
    }

    public void displayInfo() {
	System.out.println(id + "\t" + question);
	System.out.println("Answers are :: ");
	answers.forEach((answerKry, UserValue) -> {
	    System.out.println("Answer info :: " + answerKry + "\tUser Info :: " + UserValue);
	});
    }
}
