package com.pravin.spring.tutorial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pravin.spring.tutorial.bean.DepartmentAnnotation;
import com.pravin.spring.tutorial.bean.DepartmentImpAnnotation;

@Configuration
@ComponentScan(basePackages = "com.pravin.spring.tutorial.bean")
public class AppConfig {
    @Bean
    public DepartmentAnnotation getDepartment() {
	return new DepartmentImpAnnotation();
    }
}
