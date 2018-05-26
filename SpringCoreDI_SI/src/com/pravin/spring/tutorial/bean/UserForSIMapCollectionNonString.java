package com.pravin.spring.tutorial.bean;

public class UserForSIMapCollectionNonString {
    private String name;
    private String email;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    @Override
    public String toString() {
	return "UserForSIMapCollectionNonString [name=" + name + ", email=" + email + "]";
    }

}
