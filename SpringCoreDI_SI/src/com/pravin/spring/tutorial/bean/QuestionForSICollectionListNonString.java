package com.pravin.spring.tutorial.bean;

import java.util.List;

public class QuestionForSICollectionListNonString {
    private int id;
    private String question;
    private List<AnswerForSICollectionNonString> answers;

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

    public List<AnswerForSICollectionNonString> getAnswers() {
	return answers;
    }

    public void setAnswers(List<AnswerForSICollectionNonString> answers) {
	this.answers = answers;
    }

    public void displayInfo() {
	System.out.println(id + "\t" + question);
	System.out.println("Answers are :: ");
	answers.forEach(System.out::println);
    }
}
