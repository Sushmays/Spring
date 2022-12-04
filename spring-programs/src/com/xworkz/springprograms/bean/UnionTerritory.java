package com.xworkz.springprograms.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UnionTerritory {
	
	@Value("Delhi")
	private String name;
	@Value("154.23")
	private String area;
	@Value("Vinai kumar saxena")
	private String governorName;
	@Value("6000000")
	private double population;
	
	@Override
	public String toString() {
		return "UnionTerritory [name=" + name + ", area=" + area + ", governorName=" + governorName + ", population="
				+ population + "]";
	}
	

}
