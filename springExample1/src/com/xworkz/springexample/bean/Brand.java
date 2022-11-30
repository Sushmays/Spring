package com.xworkz.springexample.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Brand {

	private String name;
	@Autowired 
	@Qualifier("brandPrice")
	private double price;
	private String flavour;
	@Autowired
	@Value("Drink")
	private String type;
	private double quantity;
	
	public Brand(String name,String flavour) {
		super();
		this.name = name;
		this.flavour = flavour;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Brand [name=" + name + ", price=" + price + ", flavour=" + flavour + ", type=" + type + ", quantity="
				+ quantity + "]";
	}
		
}
