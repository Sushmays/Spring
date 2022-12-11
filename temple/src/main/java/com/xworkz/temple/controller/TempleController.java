package com.xworkz.temple.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.temple.dto.TempleDTO;

@Component
@RequestMapping("/temple")
public class TempleController {

	public TempleController() {
		System.out.println("Created TempleController");
	}
	
	@PostMapping
	public String onSend(TempleDTO dto,HttpServletRequest request) {
		System.out.println("Exicuiting onSend");
		System.out.println("dto in controller"+ dto);
		if(dto.getCloseTime()>0 && dto.getFees()>0 && dto.getOpenTime()>0 && dto.getPincode()>0) {
		request.setAttribute("message", "Temple data is saved sucessfully..");
		}
		else {
			request.setAttribute("error", "Temple data is not saved please check the data..");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";
		
	}

}
