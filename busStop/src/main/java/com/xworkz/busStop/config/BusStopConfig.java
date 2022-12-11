package com.xworkz.busStop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class BusStopConfig {

	public BusStopConfig() {
		System.out.println("created BusStopConfig");
	}

}
