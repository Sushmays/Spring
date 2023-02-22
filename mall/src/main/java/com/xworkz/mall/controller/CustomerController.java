package com.xworkz.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.mall.entity.CustomerEntity;
import com.xworkz.mall.entity.CustomerFeedbackEntity;
import com.xworkz.mall.service.CustomerService;

@Component
@RequestMapping("/send")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@PostMapping
	public String onSend(CustomerEntity entity, Model model, CustomerFeedbackEntity entity2) {
		System.out.println("executing the onSend method");
		boolean findByEmail = service.findByEmail(entity.getEmail());
		boolean findByMobileNo = service.findByMobileNo(entity.getMobileNo());
		
		
		if(!findByEmail) {
			System.out.println(entity.getEmail());
			model.addAttribute("error", "Email Already Exist");
			return "customerDetail";
		}
		else if(!findByMobileNo){
			System.out.println(entity.getMobileNo());
			model.addAttribute("error", "Mobile Number Already Exist");
			return "customerDetail";
		}
		else {
			entity.setCustomerFeedbackEntity(entity2);
			boolean customer= service.validateAndSave(entity);
			if(customer) {
				System.out.println("Saving data");
				model.addAttribute("entity", entity);
				model.addAttribute("entity", entity2);
				return "customerDetailSave";
			}
			else {
				System.out.println("Data is Not Saving..");
				model.addAttribute("error", "Data is not saved please check the data..");
				return "customerDetail";
			}
			
		}
	}

}
