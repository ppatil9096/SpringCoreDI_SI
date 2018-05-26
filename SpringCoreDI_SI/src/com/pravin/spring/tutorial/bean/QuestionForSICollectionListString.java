package com.pravin.spring.tutorial.bean;

import java.util.List;

public class QuestionForSICollectionListString {
    private int id;
    private String name;
    private List<String> answers;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public List<String> getAnswers() {
	return answers;
    }

    public void setAnswers(List<String> answers) {
	this.answers = answers;
    }

    public void displayInfo() {
	System.out.println(id + "\t" + name);
	System.out.println("answers are :: ");
	answers.forEach(System.out::println);
    }
}
