package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pen {
	
	@Autowired
	private String color;
	@Autowired
	private Refill refill;
	
	public Pen() {
		System.out.println("creating pen using default constructor");
	}
	public String getColor() {
		return color;
	}
	public void displayrefill() {
		System.out.println(refill.getLength());
	}

}
