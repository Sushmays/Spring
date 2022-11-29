package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChickenCentre {
	@Autowired
	private double chickenPrice;
	@Autowired
	private Chiken chickenOwnerName;

	public ChickenCentre() {
		System.out.println("Creating ChickenCentre using default constructor");
	}
	public double getChickenPrice() {
		return chickenPrice;
	}
	public void displayChicken() {
		System.out.println(chickenOwnerName.getChickenOwnerName());
	}
	
	

}
