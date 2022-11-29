package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Refill {

	@Autowired
	private double length;
	
	public Refill() {
		System.out.println("creating refill using default constructor");
	}

	public double getLength() {
		return length;
	}
}
