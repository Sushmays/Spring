package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Finger {

	@Autowired
	private double fingerLength;
	@Autowired
	private Nail nail;

	public Finger() {
		System.out.println("creating finger using default constructor");
	}
	public double getFingerLength() {
		return fingerLength;
	}
	public void displayNail() {
		System.out.println(nail.getNailColor());
	}

}
