package com.pravin.spring.tutorial.bean;

public class DepartmentImpAnnotation implements DepartmentAnnotation {

    @Override
    public void showDepartmentInfo() {
	System.out.println("Inside showDepartmentInfo() method");
    }

}
