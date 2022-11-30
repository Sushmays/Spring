package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Founder {
	
	private String founderName;
	private int founderAge;
	@Autowired
	@Qualifier("alive")
	private boolean alive;
	private String location;
	@Autowired
	@Qualifier("married")
	private boolean married;
	
	
	public Founder(String founderName, int founderAge) {
		super();
		this.founderName = founderName;
		this.founderAge = founderAge;
	}
	@Value("Banglore")
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Founder [founderName=" + founderName + ", founderAge=" + founderAge + ", alive=" + alive + ", location="
				+ location + ", married=" + married + "]";
	}
	
}
