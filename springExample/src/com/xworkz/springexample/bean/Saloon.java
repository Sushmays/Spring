package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Saloon {
	@Autowired
	private double saloonRent;
	@Autowired
	private String ownerName;
	@Autowired
	private Tv tv;

	public Saloon() {
		System.out.println("Creating saloon default constructor");
	}

	public double getSaloonRent() {
		return saloonRent;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void displayTvDetails() {
		System.out.println(tv.getOwnerName());
		System.out.println(tv.getBrand());
	}

}
