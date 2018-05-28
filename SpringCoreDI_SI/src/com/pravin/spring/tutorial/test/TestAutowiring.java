package com.pravin.spring.tutorial.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pravin.spring.tutorial.bean.A_Autowiring;

public class TestAutowiring {
    public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	// byName
	/*A_Autowiring autowiringName = applicationContext.getBean("aAutowiringName", A_Autowiring.class);
	autowiringName.display();
	// byType
	A_Autowiring autowiringType = applicationContext.getBean("aAutowiringType", A_Autowiring.class);
	autowiringType.display();
	A_Autowiring autowiringConstructor = applicationContext.getBean("aAutowiringConstructor", A_Autowiring.class);
	autowiringConstructor.display();
	*/
	A_Autowiring autowiringNo = applicationContext.getBean("aAutowiringNo", A_Autowiring.class);
	autowiringNo.display();
	
    }
}
