package com.xworkz.register.service;

import java.time.LocalDateTime;
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

import com.xworkz.register.dto.PatientDetailDTO;
import com.xworkz.register.repo.PatientDetailRepo;

@Component
public class PatientDetailServiceImpl implements PatientDetailService {

	@Autowired
	private PatientDetailRepo repo;

	@Override
	public String validateAndSave(PatientDetailDTO dto) {
		String message = "";
		ValidatorFactory valid = Validation.buildDefaultValidatorFactory();
		Validator validator = valid.getValidator();
		Set<ConstraintViolation<PatientDetailDTO>> validate = validator.validate(dto);
		if (validate.size() > 0) {
			System.err.println("Data is not valid");
		} else {
			System.out.println("data is valid and saved");
			boolean findByEmail = this.findByEmail(dto.getEmail());
			boolean findByMobileNo = this.findByMobileNo(dto.getMobileNo());
			if (findByEmail && findByMobileNo) {
				dto.setCreatedBy(dto.getName());
				dto.setCreatedDataTime(LocalDateTime.now());
				boolean saved = this.repo.save(dto);
				if (saved) {
					message = "Success";
				}
			} else {
				message = "Failure";
			}
		}
		return message;
	}

	@Override
	public Optional<List<PatientDetailDTO>> findByNameGreaterThanAgeOrLesserThanAge(String name, int greaterThanAge,
			int lesserThanAge) {
		StringBuilder query = new StringBuilder("select patient from PatientEntity patient where  1=1");
		List<String> option = new ArrayList<String>();
		if (name != null && !name.isEmpty()) {
			query.append(" and patient.name like '%").append(name).append("%'");
			option.add(name);
		}
		if (greaterThanAge >= 0) {
			query.append(" and patient.age>=").append(greaterThanAge);
		}
		if (lesserThanAge > 0 && lesserThanAge <= 200) {
			query.append(" and patient.age<=").append(lesserThanAge);
		}
		System.out.println("Query Generated..." + query);

		return this.repo.findByNameGreaterThanAgeOrLesserThanAge(name, greaterThanAge, lesserThanAge);
	}

	@Override
	public boolean findByEmail(String email) {
		List<PatientDetailDTO> findByEmail = repo.findByEmail(email);
		if (findByEmail!=null && !findByEmail.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean findByMobileNo(long mobileNo) {
		List<PatientDetailDTO> findByMobileNo = repo.findByMobileNo(mobileNo);
		if (findByMobileNo!=null && !findByMobileNo.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}