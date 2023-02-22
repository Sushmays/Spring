package com.xworkz.mall.service;

import com.xworkz.mall.entity.AdminEntity;

public interface MallService {
	
	AdminEntity findByAdminNameAndPassword(String adminName, String password);

	default boolean sendMail(String email, String password) {
		return true;

	}

	AdminEntity findByName(String adminName);

	AdminEntity updatePasswordByGeneratedPassword(String generatedPassword, String password);

	AdminEntity findByMallName(String name);

	AdminEntity updateAccountUnlockByName(String adminName, String accountLocked);
}
