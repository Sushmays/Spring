package com.xworkz.springexample.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springexample.bean.Tv;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {
		
	
	@Bean
	public String ownerName() {
		System.out.println("Registering the ownerName");
		return "Siddu";
	}
	@Bean
	public String brand() {
		System.out.println("Registering the brand");
		return "Redmi";
	}
	@Bean
	public double saloonRent() {
		System.out.println("Registering the saloonRent");
		return 18000.00;
	}
	@Bean
	public String chickenOwnerName() {
		System.out.println("Registering the chickenOwnerName");
		return "Siri";
	}
	@Bean
	public double chickenPrice() {
		System.out.println("Registering the chickenPrice");
		return 1000.00;
	}
	@Bean
	public String laptopBrand() {
		System.out.println("Registering the laptopBrand");
		return "Hp";
	}
	@Bean
	public String keyBoardOwner() {
		System.out.println("Registering the keyBoardOwner");
		return "Shakri";
	}
	@Bean
	public String kitchenOwner() {
		System.out.println("Registering the kitchenOwner");
		return "Sharu";
	}
	@Bean
	public String stoveOwner() {
		System.out.println("Registering the stoveOwner");
		return "Shambu";
	}
	@Bean
	public String humanName() {
		System.out.println("Registering the humanName");
		return "Human";
	}
	@Bean
	public String MouthOwner() {
		System.out.println("Registering the MouthOwner");
		return "Mouth";
	}
	@Bean
	public String refOwner() {
		System.out.println("Registering the Refrigerator");
		return "Refrigerator";
	}
	@Bean
	public String bakeryOwner() {
		System.out.println("Registering the bakeryOwner");
		return "BO";
	}
	@Bean
	public String ownerNaam() {
		System.out.println("Registering the ownerNaam");
		return "Naam";
	}
	@Bean
	public String driverName() {
		System.out.println("Registering the driverName");
		return "Driver";
	}
	@Bean
	public String busName() {
		System.out.println("Registering the busName");
		return "Bus";
	}
	@Bean
	public double size() {
		System.out.println("Registering the size");
		return 2.6;
	}
	@Bean
	public String theatorName() {
		System.out.println("Registering the theatorName");
		return "theator";
	}
	@Bean
	public String beautyParlerOwner() {
		System.out.println("Registering the beautyParlerOwner");
		return "Parler";
	}
	@Bean
	public String mirrorOwner() {
		System.out.println("Registering the mirrorOwner");
		return "ParlerMirror";
	}
	@Bean
	public String bikeName() {
		System.out.println("Registering the bikeName");
		return "NS";
	}
	@Bean
	public String keyType() {
		System.out.println("Registering the keyType");
		return "Automatic";
	}
	@Bean
	public String noseOwner() {
		System.out.println("Registering the noseOwner");
		return "Nose";
	}
	@Bean
	public String humanName1() {
		System.out.println("Registering the humanName1");
		return "Lacchu";
	}
	@Bean
	public double length() {
		System.out.println("Registering the length");
		return 10;
	}
	@Bean
	public String color() {
		System.out.println("Registering the color");
		return "Black";
	}	
	@Bean
	public String capColor() {
		System.out.println("Registering the capColor");
		return "Gold";
	}
	@Bean
	public String bottleColor() {
		System.out.println("Registering the bottleColor");
		return "Green";
	}
	@Bean
	public String nailColor() {
		System.out.println("Registering the nailColor");
		return "HalfWhite";
	}
	@Bean
	public double fingerLength() {
		System.out.println("Registering the fingerLength");
		return 11.02;
	}
	@Bean
	public String capital() {
		System.out.println("Registering the capital");
		return "Bengaluru";
	}
	@Bean
	public String villageName() {
		System.out.println("Registering the villageName");
		return "Yaladahalli";
	}
	@Bean
	public String districtName() {
		System.out.println("Registering the districtName");
		return "Mandya";
	}
	@Bean
	public String countryName() {
		System.out.println("Registering the countryName");
		return "India";
	}
	
	@Bean
	public String indiaCapital() {
		System.out.println("Registering the indiaCapital");
		return "Delhi";
	}
	@Bean
	public String stateName() {
		System.out.println("Registering the stateName");
		return "Karnataka";
	}
	@Bean
	public String stateCapitalName() {
		System.out.println("Registering the stateCapitalName");
		return "Banglore";
	}
	@Bean
	public String fanBrand() {
		System.out.println("Registering the fanBrand");
		return "Leo";
	}
	@Bean
	public double capacity() {
		System.out.println("Registering the capacity");
		return 3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
