package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fan {
	@Autowired
	private String fanBrand;
	@Autowired
	private Rotor rotor;

	public Fan() {
		System.out.println("creating fan using default constructor");
	}

	public String getFanBrand() {
		return fanBrand;
	}

	public void displayRotor() {
		System.out.println(rotor.getCapacity());
	}
}
