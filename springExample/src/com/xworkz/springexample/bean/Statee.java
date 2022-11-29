package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Statee {

	@Autowired
	private String stateName;
	@Autowired
	private StateCapital stateCapital;

	public Statee() {
		System.out.println("creating state using default constructor");
	}

	public String getStateName() {
		return stateName;
	}
	public void displayStatecapital(){
		System.out.println(stateCapital.getStateCapitalName());
	}

	/*public void displayStatecapital() {
		System.out.println(stateCapital.getStateCapitalName());
	}*/
}
