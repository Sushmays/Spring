package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hospital {
	
	private String hospitalName;
	@Value("Cardioc")
	private String hospitalType;
	private int noOfBeds;
	
	public Hospital(@Value("Jaydev") String hospitalName) {
		super();
		this.hospitalName = hospitalName;
	}
	@Value("6000")
	public void setNoOfBeds(int noOfBeds) {
		this.noOfBeds = noOfBeds;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", hospitalType=" + hospitalType + ", noOfBeds=" + noOfBeds
				+ "]";
	}

}
