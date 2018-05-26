package com.pravin.spring.tutorial.bean;

public class EmployeeForSIDependentObj {
    private int id;
    private String name;
    private AddressForEIDependentObj addressForEIDependentObj;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public AddressForEIDependentObj getAddressForEIDependentObj() {
	return addressForEIDependentObj;
    }

    public void setAddressForEIDependentObj(AddressForEIDependentObj addressForEIDependentObj) {
	this.addressForEIDependentObj = addressForEIDependentObj;
    }

    public void displayInfo() {
	System.out.println(id + " " + name);
	System.out.println(addressForEIDependentObj);
    }

}
