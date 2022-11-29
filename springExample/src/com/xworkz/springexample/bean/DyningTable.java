package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DyningTable {

	@Autowired
	private String ownerNaam;

	public DyningTable() {
		System.out.println("Creating dyning using default Constructor");
	}

	public String getOwnerNaam() {
		return ownerNaam;
	}

}
