package com.xworkz.mall.repo;

import java.time.LocalTime;

import com.xworkz.mall.entity.AdminEntity;

public interface MallRepository {
	
	AdminEntity findByAdminNameAndPassword(String adminName, String password);

	AdminEntity updateNoOfWrongAttemptsByName(String adminName, int noOfWrongAttempt);

	AdminEntity findByName(String adminName);

	AdminEntity updatefirstLoginByName(String adminName, int firstLogin);

	AdminEntity updateAccountLockedByName(String adminName, String accountLocked);

	AdminEntity updateGeneratedPasswordByName(String adminName, String generatedPassword);

	AdminEntity updatePasswordByGeneratedPassword(String generatedPassword, String password);

	AdminEntity findByMallName(String name);

	AdminEntity updateGeneratedPasswordByMallName(String name, String generatedPassword);

	AdminEntity updateLoginCountByAdminName(String adminName, int loginCount);

	AdminEntity updateTimeByMall(String name, LocalTime time);

	AdminEntity updateAccountUnlockByName(String name, String accountLocked);

	AdminEntity updateNoOfWrongAttemptsByMallName(String name, int noOfWrongAttempts);

	AdminEntity findByGeneratedPassword(String generatedPassword);

	AdminEntity updateGeneratedPasswordTimeByGeneratedPassword(String generatedPassword,
			LocalTime generatedPasswordTime);
	
}
