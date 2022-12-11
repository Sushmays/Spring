package com.xworkz.busStop.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BusStopDTO {

	private String stopName;
	private int busNo;
	private int noOfShops;
	private String type;
	private String color;

}
