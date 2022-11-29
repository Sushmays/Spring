package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kitchen {

	@Autowired
	private String kitchenOwner;
	@Autowired
	private Stove stove;

	public Kitchen() {
		System.out.println("creating kotchen using default constructor");
	}
	
	public String getKitchenOwner() {
		return kitchenOwner;
	}
	public void displayStove() {
		System.out.println(stove.getStoveOwner());
	}
}
