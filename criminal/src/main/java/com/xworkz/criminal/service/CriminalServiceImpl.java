package com.xworkz.criminal.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.criminal.dto.CriminalEntity;
import com.xworkz.criminal.repo.CriminalRepo;

@Component
public class CriminalServiceImpl implements CriminalService{
	
	@Autowired
	private CriminalRepo repo;
	
	@Override
	public boolean validateAndSave(CriminalEntity entity) {
		System.out.println("Running validateAndSave in service");
		ValidatorFactory valid = Validation.buildDefaultValidatorFactory();
		Validator validator = valid.getValidator();
		Set<ConstraintViolation<CriminalEntity>> validate = validator.validate(entity);
		if (validate.size() > 0) {
			System.err.println("Data is not valid");
		}
		else {
			System.out.println("Data is valid");
		}
	
		return this.repo.save(entity);
	}
		
	@Override
	public Optional<List<CriminalEntity>> fingByCriminalNameAndJailName(String criminalName, String jailName) {
		System.out.println("Running fingByCriminalNameAndJailName in service");
		StringBuilder query = new StringBuilder("select criminal from CriminalEntity criminal where  1=1");
		List<String> option = new ArrayList<String>();
		if (criminalName != null && !criminalName.isEmpty()) {
			query.append(" and criminal.name").append(criminalName);
			option.add(criminalName);
		}
		if (jailName != null && !jailName.isEmpty()) {
			query.append(" and criminal.jailName").append(jailName);
			option.add(jailName);
		}
		
		System.out.println("Query Generated..." + query);
		
		return CriminalService.super.fingByCriminalNameAndJailName(criminalName, jailName);
	}


}
