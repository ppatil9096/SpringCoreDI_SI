package com.pravin.spring.tutorial.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pravin.spring.tutorial.bean.A_Autowiring;

public class TestAutowiring {
    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	A_Autowiring a_Autowiring = applicationContext.getBean("aAutowiring", A_Autowiring.class);
	a_Autowiring.display();
    }
}
