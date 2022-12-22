package com.xworkz.register.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.register.dto.PatientDetailDTO;
import com.xworkz.register.service.PatientDetailService;

@Component
@RequestMapping("/save")
public class PatientDetailController {

	@Autowired
	private PatientDetailService service;

	public PatientDetailController() {
		System.out.println("Created PatientDetailController");
	}

	@PostMapping
	public String onSend(PatientDetailDTO dto, HttpServletRequest request,@RequestParam MultipartFile image) {
		System.out.println("Exicuted onSend...");
		String message= service.validateAndSave(dto);
		//boolean findByEmail = service.findByEmail(dto.getEmail());
		//boolean findByMobileNo = service.findByMobileNo(dto.getMobileNo());
		/*
		 * if (!findByEmail) { request.setAttribute("error", "Email alredy exists");
		 * return "index"; } else if(!findByMobileNo){ request.setAttribute("error1",
		 * "mobile alredy exists"); return "index"; }else {
		 */
		if (message.equals("Success")) {
			request.setAttribute("message", "Patient Details saved successfully..");
			System.out.println("Patient Details" + dto);
			request.setAttribute("dto", dto);
			if (image != null) {
				// Get the file and save it somewhere
				byte[] bytes;
				System.out.println("File original name" + image.getOriginalFilename());
				System.out.println("File size" + image.getSize());
				System.out.println("File type" + image.getContentType());
				try {
					bytes = image.getBytes();
					Path path = Paths.get("D:\\app-image\\" + image.getOriginalFilename());
					Files.write(path, bytes);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}		
			return "save";
		} else {
			request.setAttribute("error", "Error in saving");
			request.setAttribute("dto", dto);
		}
		return "index";
		/* } */
	}
		
	@GetMapping
	public String findByNameGreaterThanAgeOrLesserThanAge(@RequestParam String name, @RequestParam int greaterThanAge,
			@RequestParam int lesserThanAge, Model model) {
		System.out.println("Name selected from UI" + name);
		Optional<List<PatientDetailDTO>> optionalList = this.service.findByNameGreaterThanAgeOrLesserThanAge(name, greaterThanAge, lesserThanAge);
		if (optionalList.isPresent() && optionalList.get().size() > 0) {
			System.out.println("Data is present ");
			List<PatientDetailDTO> list = optionalList.get();
			System.out.println("Total List is found" + list.size());
			model.addAttribute("list", list);
		} else {
			System.out.println("Data is not present for " + name);
			model.addAttribute("message", "No Results found");

		}
		return "next";
	}
	
	

}
