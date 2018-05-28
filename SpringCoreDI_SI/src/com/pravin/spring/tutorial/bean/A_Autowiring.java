package com.pravin.spring.tutorial.bean;

public class A_Autowiring {
    B_Autowiring b_Autowiring;// this should be same as bean id

    public A_Autowiring() {
	System.out.println("A is created");
    }

    public B_Autowiring getB_Autowiring() {
	return b_Autowiring;
    }

    public void setB_Autowiring(B_Autowiring b_Autowiring) {
	this.b_Autowiring = b_Autowiring;
    }

    public void print() {
	System.out.println("Hello A");
    }

    public void display() {
	print();
	b_Autowiring.print();
    }

}
