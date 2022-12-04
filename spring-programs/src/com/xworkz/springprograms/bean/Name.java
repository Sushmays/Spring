package com.xworkz.springprograms.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xworkz.springprograms.enums.TypeCredentials;

@Component
public class Name {

	@Value("smt")
	private String firstName;
	@Value("Droupadi")
	private String middleName;
	@Value("Murmu")
	private String lastName;
	@Autowired
	@Qualifier("type")
	private TypeCredentials type;

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", type="
				+ type + "]";
	}

}
