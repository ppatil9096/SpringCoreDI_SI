package com.pravin.spring.tutorial.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pravin.spring.tutorial.bean.QuestionForSICollectionListNonString;

public class TestSIForNonStringCollectionListObj {
    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	QuestionForSICollectionListNonString collectionListNonString = applicationContext
		.getBean("siQuestionNonStringCollectioListObj", QuestionForSICollectionListNonString.class);
	collectionListNonString.displayInfo();
    }
}
