package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Karnataka {
	@Autowired
	private CapitalCity capitalCity;

	public Karnataka() {
		System.out.println("creating karnataka using default constructor");
	}

	public void displayCapital() {
		System.out.println(capitalCity.getCapital());
	}
}
