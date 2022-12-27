package com.xworkz.criminal.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.criminal.dto.CriminalEntity;

public interface CriminalService {
	
	boolean validateAndSave(CriminalEntity entity);
	
	default Optional<List<CriminalEntity>> fingByCriminalNameAndJailName(String criminalName, String jailName) {
		return Optional.empty();
	}
	
}
