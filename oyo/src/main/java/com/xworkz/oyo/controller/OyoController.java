package com.xworkz.oyo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.oyo.dto.OyoDTO;

@Component
@RequestMapping("/oyo")
public class OyoController {

	public OyoController() {
		System.out.println("created OyoController using default constructor");
	}

	@PostMapping
	public String onSend(OyoDTO dto, HttpServletRequest request) {
		System.out.println("Exicuted onSend");
		System.out.println("dto in controller:" + dto);
		if (dto.getPrice() > 0 && dto.getSince() > 0) {
			request.setAttribute("message", "Oyo detail saved successfully...");
		} else {
			request.setAttribute("error", "Oyo detail not saved please check the data...");
			request.setAttribute("dto", dto);
		}
		return "index.jsp";

	}

}
