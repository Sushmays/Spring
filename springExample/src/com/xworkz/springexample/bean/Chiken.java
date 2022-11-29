package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Chiken {

	@Autowired
	private String chickenOwnerName;

	public Chiken() {
		System.out.println("Creating Chicken using default constructor");
	}
	public String getChickenOwnerName() {
		return chickenOwnerName;
	}

}
