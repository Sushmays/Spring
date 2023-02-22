package com.xworkz.mall.repo;

import java.util.List;

import com.xworkz.mall.entity.CustomerEntity;
import com.xworkz.mall.entity.CustomerFeedbackEntity;

public interface CustomerRopository {
	
	boolean save(CustomerEntity entity);
	
//	boolean save(CustomerFeedbackEntity entity);

	List<CustomerEntity> findByName(String name);
	
	List<CustomerEntity> findByEmail(String email);
	
	List<CustomerEntity> findByMobileNo(long mobileNo);
}
