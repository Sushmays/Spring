package com.xworkz.springprograms.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class President {

	@Autowired
	private Name presidentName;
	@Autowired
	@Qualifier("presidentAge")
	private int age;
	@Value("40000.00")
	private double salary;
	@Value("2")
	private double expertise;
	@Value("PHD")
	private String education;
	
	
	@Override
	public String toString() {
		return "President [presidentName=" + presidentName + ", age=" + age + ", salary=" + salary + ", expertise="
				+ expertise + ", education=" + education + "]";
	}
	
	
	
	
	
	
	
	
/*	@Value("Droupadi Murmu")
	private String presidentName;
	@Value("64")
	private int age;
	@Value("1.5")
	private double salary;
	@Value("2")
	private double expertise;
	@Value("BA")
	private String education;
	@Override
	public String toString() {
		return "President [presidentName=" + presidentName + ", age=" + age + ", salary=" + salary + ", expertise="
				+ expertise + ", education=" + education + "]";
	}*/
	
	
}
