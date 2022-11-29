package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Nose {
	@Autowired
	private String noseOwner;

	public Nose() {
		System.out.println("creating nose using default constructor");
	}

	public String getNoseOwner() {
		return noseOwner;
	}

}
