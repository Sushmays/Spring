package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rotor {
	@Autowired
	private double capacity;

	public Rotor() {
		System.out.println("creating rotor using default constructor");
	}
	public double getCapacity() {
		return capacity;
	}

}
