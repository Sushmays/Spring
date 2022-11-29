package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bakery {
	@Autowired
	private String bakeryOwner;
	@Autowired
	private Refrigerator ref;

	public Bakery() {
		System.out.println("Creating bakery using default constructor");
	}
	public String getBakeryOwner() {
		return bakeryOwner;
	}
	public void displayRef() {
		System.out.println(ref.getRefOwner());
	}

}
