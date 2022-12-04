package com.xworkz.springprograms.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {

	@Value("250000.00")
	private double grossSalary;
	@Value("30500.00")
	private double netSalary;
	@Value("6000")
	private double pf;
	@Value("15000")
	private double bonus;
	@Value("2500")
	private double hra;
	@Value("false")
	private boolean ot;
	@Value("true")
	private boolean variable;
	
	
	@Override
	public String toString() {
		return "Salary [grossSalary=" + grossSalary + ", netSalary=" + netSalary + ", pf=" + pf + ", bonus=" + bonus
				+ ", hra=" + hra + ", ot=" + ot + ", variable=" + variable + "]";
	}
	
	



}
