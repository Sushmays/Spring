package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class House {
	@Autowired
	private String ownerNaam;
	@Autowired
	private DyningTable dyning;

	public House() {
		System.out.println("creating house using default constructor");
	}

	public String getOwnerNaam() {
		return ownerNaam;
	}
	
	public void displayDyning() {
		System.out.println(dyning.getOwnerNaam());
	}
}
