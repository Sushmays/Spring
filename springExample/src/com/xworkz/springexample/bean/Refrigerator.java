package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Refrigerator {

	@Autowired
	private String refOwner;

	public Refrigerator() {
		System.out.println("craeting refrigerator using default constructor");
	}
	public String getRefOwner() {
		return refOwner;
	}

}
