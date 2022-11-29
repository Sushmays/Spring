package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cap {
	@Autowired
	private String capColor;

	public Cap() {
		System.out.println("creating cap using default constructor");
	}
	public String getCapColor() {
		return capColor;
	}

}
