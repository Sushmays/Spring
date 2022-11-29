package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CapitalCity {
	@Autowired
	private String capital;

	public CapitalCity() {
		System.out.println("Creating capitalCity using default constructor");
	}

	public String getCapital() {
		return capital;
	}
}
