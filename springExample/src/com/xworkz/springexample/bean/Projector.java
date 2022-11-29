package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Projector {
	@Autowired
	private double size;

	public Projector() {
		System.out.println("creating projector using default constructor");
	}
	public double getSize() {
		return size;
	}

}
