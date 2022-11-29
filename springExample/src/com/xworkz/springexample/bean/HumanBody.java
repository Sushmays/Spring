package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HumanBody {
	@Autowired
	private String humanName;
	@Autowired
	private Mouth mouth;

	public HumanBody() {
		System.out.println("Creating humanBody using default constructor");
	}

	public String getHumanName() {
		return humanName;
	}

	public void displayMouth() {
		System.out.println(mouth.getMouthOwner());
	}
}
