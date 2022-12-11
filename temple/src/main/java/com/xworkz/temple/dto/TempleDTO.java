package com.xworkz.temple.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TempleDTO {
	
	private String name;
	private String location;
	private String mainGod;
	private int pincode;
	private double fees;
	private double openTime;
	private double closeTime;
	
	

}
