package com.pravin.spring.tutorial.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pravin.spring.tutorial.bean.QuestionForSICollectionListString;

public class TestSIForCollectionListString {
    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	QuestionForSICollectionListString collectionListString = applicationContext.getBean("siCollectionStringObj",
		QuestionForSICollectionListString.class);
	collectionListString.displayInfo();
    }
}
