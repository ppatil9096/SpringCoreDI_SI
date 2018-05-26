package com.pravin.spring.tutorial.bean;

import java.util.Date;

public class AnswerForSIMapCollectionNonString {
    private String answer;
    private Date postDate;

    public String getAnswer() {
	return answer;
    }

    public void setAnswer(String answer) {
	this.answer = answer;
    }

    public Date getPostDate() {
	return postDate;
    }

    public void setPostDate(Date postDate) {
	this.postDate = postDate;
    }

    @Override
    public String toString() {
	return "AnswerForSIMapCollectionNonString [answer=" + answer + ", postDate=" + postDate + "]";
    }

}
