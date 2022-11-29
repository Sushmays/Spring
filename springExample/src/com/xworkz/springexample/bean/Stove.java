package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stove {

	@Autowired
	private String stoveOwner;

	public Stove() {
		System.out.println("Creating stove using default constructor");
	}
	
	public String getStoveOwner() {
		return stoveOwner;
	}

}
