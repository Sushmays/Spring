package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Borewell {
	
	private double length;
	private double capacity;
	private String place;
	@Autowired
	@Qualifier("borewellOwner")
	private String ownerName;
	@Autowired
	@Qualifier("borewellOwnerAlive")
	private boolean alive;
	
	public Borewell(double length, double capacity) {
		super();
		this.length = length;
		this.capacity = capacity;
	}
	@Value("Mandya")
	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Borewell [length=" + length + ", capacity=" + capacity + ", place=" + place + ", ownerName=" + ownerName
				+ ", alive=" + alive + "]";
	}
	
}
