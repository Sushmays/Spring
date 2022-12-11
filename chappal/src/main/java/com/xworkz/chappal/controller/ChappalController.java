package com.xworkz.chappal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.chappal.dto.ChappalDTO;

@Component
@RequestMapping("/chapal")
public class ChappalController {

	public ChappalController() {
		System.out.println("Created ChappalController using default constructor");
	}

	@PostMapping
	public String onSend(ChappalDTO dto,HttpServletRequest request) {
		System.out.println("Exicuting onSend");
		System.out.println("dto from controller: "+ dto);
		if(dto.getSize()>0 && dto.getPrice()>0) {
		request.setAttribute("message", "Chappal details are saved successfully..");
		}
		else {
			request.setAttribute("error", "Chappal details are not saved please check the data..");	
			request.setAttribute("dto", dto);
		}
		return "index.jsp";		
	}
	
}
