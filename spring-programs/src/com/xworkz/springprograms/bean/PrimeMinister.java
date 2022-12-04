package com.xworkz.springprograms.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrimeMinister {
	
	@Value("Narendra Damodardas Modi")
	private String name;
	@Value("72")
	private int age;
	@Autowired
	private State state;
	@Autowired
	private Education education;
	@Autowired
	private Salary salary;
	@Value("BJP")
	private String party;
	
	
	@Override
	public String toString() {
		return "PrimeMinister [name=" + name + ", age=" + age + ", state=" + state + ", education=" + education
				+ ", salary=" + salary + ", party=" + party + "]";
	}
	

}
