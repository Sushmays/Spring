package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mouth {

	@Autowired
	private String MouthOwner;

	public Mouth() {
		System.out.println("Creating mouth using default constructor");
	}
	public String getMouthOwner() {
		return MouthOwner;
	}
}
