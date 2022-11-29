package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//by default of the ref is same as the class name with smallercase
//@Component("videocon")
public class Tv {
	
	@Autowired
	private String ownerName;
	@Autowired
	private String brand;

	public Tv() {
		System.out.println("Creating Tv using default constructor");
	}
	public String getOwnerName() {
		return ownerName;
	}
	public String getBrand() {
		return brand;
	}
}
