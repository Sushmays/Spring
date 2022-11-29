package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bus {

	@Autowired
	private String busName;
	@Autowired
	private BusDriver driver;

	public Bus() {
		System.out.println("Creating bus using default constructor");
	}

	public String getBusName() {
		return busName;
	}

	public void displayDriver() {
		System.out.println(driver.getDriverName());
	}

}
