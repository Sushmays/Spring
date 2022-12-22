package com.xworkz.register.repo;

import java.util.List;
import java.util.Optional;


import com.xworkz.register.dto.PatientDetailDTO;

public interface PatientDetailRepo {

	boolean save(PatientDetailDTO dto);
	
	default Optional<List<PatientDetailDTO>> findByNameGreaterThanAgeOrLesserThanAge(String name, int greaterThanAge, int lesserThanAge){
		return Optional.empty();
}
	default Optional<List<PatientDetailDTO>> findByQuery(String query) {
		return Optional.empty();
	}
	
	List<PatientDetailDTO> findByEmail(String email);

	List<PatientDetailDTO> findByMobileNo(long mobileNo);
}
