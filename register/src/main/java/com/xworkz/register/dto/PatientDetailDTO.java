package com.xworkz.register.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient_db")
@NamedQuery(name = "findByNameGreaterThanAgeOrLesserThanAge", query = "select patient from PatientDetailDTO patient where patient.name=:nam or (patient.age>=:ag and patient.age<=:ae)")
@NamedQuery(name = "findByEmail", query = "select patient from PatientDetailDTO patient where patient.email=:em")
@NamedQuery(name = "findByMobileNo", query = "select patient from PatientDetailDTO patient where patient.mobileNo=:mb")
public class PatientDetailDTO extends AbstractionDTo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotEmpty
	@NonNull
	@Length(min = 2, max = 50)
	private String name;
	@NotNull
	@NotEmpty
	@Length(min = 3, max = 50)
	@Email
	private String email;
	@Min(value = 1)
	private int age;
	@NotNull
	private long mobileNo;
	private String gender;
	@NotEmpty
	@NotNull
	@Length(min = 2, max = 50)
	private String idProof;
	private String idValue;
	private boolean BPLCard;
	private boolean insurance;

	public PatientDetailDTO(String createdBy, LocalDateTime createdDataTime,
			@NotEmpty @NonNull @Length(min = 2, max = 50) String name,
			@NotEmpty @NonNull @Length(min = 2, max = 50) String email, @Min(1) int age, @NotNull long mobileNo,
			String gender, @NotEmpty @NotNull @Length(min = 2, max = 50) String idProof, String idValue,
			boolean bPLCard, boolean insurance) {
		super(createdBy, createdDataTime);
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.idProof = idProof;
		this.idValue = idValue;
		BPLCard = bPLCard;
		this.insurance = insurance;
	}

}
