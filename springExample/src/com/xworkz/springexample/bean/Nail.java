package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Nail {
	@Autowired
	private String nailColor;

	public Nail() {
		System.out.println("creating nail using default constructor");
	}

	public String getNailColor() {
		return nailColor;
	}
}
