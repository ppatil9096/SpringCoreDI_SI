package com.pravin.spring.tutorial.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pravin.spring.tutorial.bean.EmployeeForSIPrimitiveString;

@SuppressWarnings("deprecation")
public class TestSIForPrimitiveAndString {

    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeForSIPrimitiveString employee = applicationContext.getBean("siPrimitiveAndString",
		EmployeeForSIPrimitiveString.class);
	employee.show();
	System.out.println("=============");
	Resource r = new ClassPathResource("applicationContext.xml");
	BeanFactory factory = new XmlBeanFactory(r);
	EmployeeForSIPrimitiveString s = (EmployeeForSIPrimitiveString) factory.getBean("siPrimitiveAndString");
	s.show();
    }

}
