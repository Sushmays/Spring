package com.xworkz.busStop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.busStop.dto.BusStopDTO;

@Component
@RequestMapping("/busstop")
public class BusStopController {

	public BusStopController() {
		System.out.println("Created BusStopController");
	}
	@PostMapping
	public String onSend(BusStopDTO dto, HttpServletRequest request) {
		System.out.println("Exicuted onSend");
		System.out.println("Controlling Dto:"+dto);
		if(dto.getBusNo()>0 && dto.getNoOfShops()>0) {
			request.setAttribute("message", "Bus Stop data is saved successfully..");
		}
		else {
			request.setAttribute("error", "Bus Stop data is not saved please check the data..");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
	}

}
