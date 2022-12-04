package com.xworkz.springprograms.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Country {

	@Value("India")
	private String name;
	@Autowired
	private President president;
	@Autowired
	private VicePresident vicePresident;
	@Value("1455550.00")
	private double armySize;
	@Value("Democratic")
	private String type;
	@Autowired
	private State state;
	@Autowired
	private UnionTerritory unionTerritory;
	@Autowired
	private City capitalCity;

	@Override
	public String toString() {
		return "Country [name=" + name + ", president=" + president + ", vicePresident=" + vicePresident + ", armySize="
				+ armySize + ", type=" + type + ", state=" + state + ", unionTerritory=" + unionTerritory
				+ ", capitalCity=" + capitalCity + "]";
	}

}
