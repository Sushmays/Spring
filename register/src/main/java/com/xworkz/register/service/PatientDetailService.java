package com.xworkz.register.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.register.dto.PatientDetailDTO;

public interface PatientDetailService {

	String validateAndSave(PatientDetailDTO dto);

	default Optional<List<PatientDetailDTO>> findByNameGreaterThanAgeOrLesserThanAge(String name,int greaterThanAge,int lesserThanAge) {
		return Optional.empty();
	}

	boolean findByEmail(String email);

	boolean findByMobileNo(long mobileNo);
	
	
}
