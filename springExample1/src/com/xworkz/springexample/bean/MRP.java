package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MRP {

	private String type;
	@Value("Mysore")
	private String location;
	private int noOfCounter;

	public MRP(@Value("2") int noOfCounter) {
		super();
		this.noOfCounter = noOfCounter;
	}
	@Value("Wine")
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "MRP [type=" + type + ", location=" + location + ", noOfCounter=" + noOfCounter + "]";
	}
	
}
