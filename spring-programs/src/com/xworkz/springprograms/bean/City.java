package com.xworkz.springprograms.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class City {
	
	@Value("Bengaluru")
	private String name;
	@Value("true")
	private boolean capital;
	
	@Override
	public String toString() {
		return "City [name=" + name + ", capital=" + capital + "]";
	}
	

}
