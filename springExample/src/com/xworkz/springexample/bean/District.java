package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class District {

	@Autowired
	private String districtName;

	public District() {
		System.out.println("creating district using default constructor");
	}
	public String getDistrictName() {
		return districtName;
	}
}
