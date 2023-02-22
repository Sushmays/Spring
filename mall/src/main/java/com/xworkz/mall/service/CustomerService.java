package com.xworkz.mall.service;

import java.util.List;

import com.xworkz.mall.entity.CustomerEntity;
import com.xworkz.mall.entity.CustomerFeedbackEntity;

public interface CustomerService {
	
	boolean validateAndSave(CustomerEntity entity);

//	boolean ValidateAndSave(CustomerFeedbackEntity entity);
	
	List<CustomerEntity> findByName(String name);
	
	boolean findByEmail(String email);
	
	boolean findByMobileNo(long mobileNo);
	
	default boolean sendMail(String email) {
		return true;		
	}
	
	
}
