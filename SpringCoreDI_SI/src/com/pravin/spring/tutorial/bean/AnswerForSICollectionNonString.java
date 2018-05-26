package com.pravin.spring.tutorial.bean;

public class AnswerForSICollectionNonString {
    private String answerGivenBy;
    private String answerIs;

    public String getAnswerGivenBy() {
	return answerGivenBy;
    }

    public void setAnswerGivenBy(String answerGivenBy) {
	this.answerGivenBy = answerGivenBy;
    }

    public String getAnswerIs() {
	return answerIs;
    }

    public void setAnswerIs(String answerIs) {
	this.answerIs = answerIs;
    }

    @Override
    public String toString() {
	return "AnswerForSICollectionNonString [answerGivenBy=" + answerGivenBy + ", answerIs=" + answerIs + "]";
    }

}
