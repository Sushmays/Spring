package com.xworkz.bikeShowRoom.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bikeShowRoom.dto.BikeShowRoomDTO;

@Component
@RequestMapping("/showroom")
public class BikeShowRoomController {

	public BikeShowRoomController() {
		System.out.println("Created BikeShowRoomController");
	}

	@PostMapping
	public String onSend(BikeShowRoomDTO dto, HttpServletRequest request) {
		System.out.println("Exicuted onSend");
		System.out.println("Controlling Dto :" + dto);
		if (dto.getLocation() != null) {
			request.setAttribute("message", "showRoom data is saved succesfully..");
		} else {
			request.setAttribute("error", "showRoom data not saved please check the data..");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";

	}

}
