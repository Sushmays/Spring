package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StateCapital {
	@Autowired
	private String stateCapitalName;

	public StateCapital() {
		System.out.println("creating StateCapital using default constructor");
	}

	public String getStateCapitalName() {
		return stateCapitalName;
	}
}
