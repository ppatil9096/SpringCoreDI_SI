package com.pravin.spring.tutorial.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pravin.spring.tutorial.bean.QuestionForSICollectionMapString;

public class TestSIForCollectionMapString {
    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	QuestionForSICollectionMapString collectionMapString = applicationContext
		.getBean("siQuestionForStringCollectionMapObj", QuestionForSICollectionMapString.class);
	collectionMapString.displayInfo();
    }
}
