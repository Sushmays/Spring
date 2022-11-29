package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusDriver {
	@Autowired
	private String driverName;

	public BusDriver() {
		System.out.println("Creating busdriver using default constructor");
	}

	public String getDriverName() {
		return driverName;
	}

}
