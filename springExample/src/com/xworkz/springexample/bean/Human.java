package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
	@Autowired
	private String humanName;
	@Autowired
	private Nose nose;

	public Human() {
		System.out.println("creating human using default constructor");
	}

	public String getHumanName() {
		return humanName;
	}
	public void displayNose() {
		System.out.println(nose.getNoseOwner());
	}
}

