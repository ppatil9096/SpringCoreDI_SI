package com.pravin.spring.tutorial.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pravin.spring.tutorial.bean.EmployeeForSIDependentObj;

@SuppressWarnings("deprecation")
public class TestSIForDependentObj {
    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeForSIDependentObj employeeForSIDependentObj = applicationContext.getBean("siDpendentEmployeeObj",
		EmployeeForSIDependentObj.class);
	employeeForSIDependentObj.displayInfo();
	Resource resource = new ClassPathResource("applicationContext.xml");
	BeanFactory beanFactory = new XmlBeanFactory(resource);
	EmployeeForSIDependentObj dependentObj = beanFactory.getBean("siDpendentEmployeeObj",
		EmployeeForSIDependentObj.class);
	dependentObj.displayInfo();
    }
}
