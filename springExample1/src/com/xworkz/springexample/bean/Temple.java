package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Temple {

	@Value("Iskcon Temple")
	private String templeName;
	private double openTime;
	private double templeSince;

	public Temple(@Value("1980") double templeSince) {
		super();
		this.templeSince = templeSince;
	}
	@Value("7.00")
	public void setOpenTime(double openTime) {
		this.openTime = openTime;
	}
	@Override
	public String toString() {
		return "Temple [templeName=" + templeName + ", openTime=" + openTime + ", templeSince=" + templeSince + "]";
	}

}
