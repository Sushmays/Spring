package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Land {
	
	private double squareFeet;
	private String landOwner;
	@Value("Yaladahalli")
	private String landLocation;
	
	public Land(@Value("10.25") double squareFeet) {
		super();
		this.squareFeet = squareFeet;
	}
	@Value("Manjula")
	public void setLandOwner(String landOwner) {
		this.landOwner = landOwner;
	}
	@Override
	public String toString() {
		return "Land [squareFeet=" + squareFeet + ", landOwner=" + landOwner + ", landLocation=" + landLocation + "]";
	}
	
}
