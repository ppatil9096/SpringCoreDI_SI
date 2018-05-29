package com.pravin.spring.tutorial.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompanyAnnotation {
    private DepartmentAnnotation departmentAnnotation;

    @Autowired
    public void setDepartmentAnnotation(DepartmentAnnotation departmentAnnotation) {
	this.departmentAnnotation = departmentAnnotation;
    }

    public void shoDepartmentInfo() {
	departmentAnnotation.showDepartmentInfo();
    }

}
