package com.pravin.spring.tutorial.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pravin.spring.tutorial.bean.CompanyAnnotation;
import com.pravin.spring.tutorial.config.AppConfig;

public class TestAnnotationBasedSI {
    public static void main(String[] args) {
	AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
		AppConfig.class);
	CompanyAnnotation companyAnnotation = annotationConfigApplicationContext.getBean(CompanyAnnotation.class);
	companyAnnotation.shoDepartmentInfo();
	annotationConfigApplicationContext.close();
    }
}
