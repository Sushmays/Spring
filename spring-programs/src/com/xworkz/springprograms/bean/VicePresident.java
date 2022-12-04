package com.xworkz.springprograms.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VicePresident extends President{
	
	@Value("Jagdeep Dhankhar")
	private String vicePresidentName;

	@Override
	public String toString() {
		return "VicePresident [vicePresidentName=" + vicePresidentName + "]";
	}
	
	

}
