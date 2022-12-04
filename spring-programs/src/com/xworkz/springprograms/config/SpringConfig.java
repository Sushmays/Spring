package com.xworkz.springprograms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springprograms.bean.City;
import com.xworkz.springprograms.bean.Country;
import com.xworkz.springprograms.bean.Name;
import com.xworkz.springprograms.bean.President;
import com.xworkz.springprograms.bean.PrimeMinister;
import com.xworkz.springprograms.bean.State;
import com.xworkz.springprograms.bean.UnionTerritory;
import com.xworkz.springprograms.bean.VicePresident;
import com.xworkz.springprograms.enums.TypeCredentials;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {
	
	@Bean
	public Country country() {
		System.out.println("Registering the CountryDetail");
		Country countryDetail=new Country();
		return countryDetail;
		
	}
	
	@Bean
	public int presidentAge() {
		return 64;	
	}
	
	@Bean
	public TypeCredentials type() {
		return TypeCredentials.PERSON;
		
	}
	
	
	
	
	


	
}

