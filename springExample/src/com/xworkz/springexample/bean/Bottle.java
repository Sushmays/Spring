package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bottle {
	@Autowired
	private String bottleColor;
	@Autowired
	private Cap cap;
	public Bottle() {
		System.out.println("creating bottle using default constructor");
	}
	public String getBottleColor() {
		return bottleColor;
	}
	public void displayCap() {
		System.out.println(cap.getCapColor());
	}
	
}
