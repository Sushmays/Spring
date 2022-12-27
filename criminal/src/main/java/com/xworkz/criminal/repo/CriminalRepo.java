package com.xworkz.criminal.repo;

import java.util.List;

import java.util.Optional;

import com.xworkz.criminal.dto.CriminalEntity;

public interface CriminalRepo {

	boolean save(CriminalEntity entity);

	default Optional<List<CriminalEntity>> fingByCriminalNameAndJailName(String criminalName, String jailName) {
		return Optional.empty();
	}

	/*default Optional<List<CriminalEntity>> findByQuery(String query) {
		return Optional.empty();
	}*/

}
