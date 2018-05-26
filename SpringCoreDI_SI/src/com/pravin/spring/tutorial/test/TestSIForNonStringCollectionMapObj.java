package com.pravin.spring.tutorial.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pravin.spring.tutorial.bean.QuestionForSICollectionMapNonString;

public class TestSIForNonStringCollectionMapObj {
    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	QuestionForSICollectionMapNonString collectionMapNonString = applicationContext
		.getBean("siQuestionNonStringCollectionMap", QuestionForSICollectionMapNonString.class);
	collectionMapNonString.displayInfo();
    }
}
