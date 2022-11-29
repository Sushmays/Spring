package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Village {

	@Autowired
	private String villageName;
	@Autowired
	private District district;

	public Village() {
		System.out.println("Creating village using default constructor");
	}
	public String getVillageName() {
		return villageName;
	}
	public void displayDistrict() {
		System.out.println(district.getDistrictName());
	}

}
