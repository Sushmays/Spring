package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BikeLock {
	@Autowired
	private String bikeName;
	@Autowired
	private Key key;

	public BikeLock() {
		System.out.println("creating bikelock using default constructor");
	}
	public String getBikeName() {
		return bikeName;
	}
	public void displayKey() {
		System.out.println(key.getKeyType());
	}

}
