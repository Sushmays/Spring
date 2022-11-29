package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Theator {

	@Autowired
	private String theatorName;
	@Autowired
	private Projector proj;

	public Theator() {
		System.out.println("Creating theator using default constructor");
	}

	public String getTheatorName() {
		return theatorName;
	}
	public void displayProj() {
		System.out.println(proj.getSize());
	}
}
