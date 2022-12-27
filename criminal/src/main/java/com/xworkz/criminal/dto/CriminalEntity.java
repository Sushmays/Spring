package com.xworkz.criminal.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="criminal_db")
@NamedQuery(name = "fingByCriminalNameAndJailName",query = "select criminal from CriminalEntity criminal where " + "(:cn is null or criminal.criminalName=:cn) or"+"(:jn is null or criminal.jailName=:jn)")
public class CriminalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NonNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String criminalName;
	@NonNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String crime;
	private int totalYearAwarded;
	@NonNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String aliasName;
	@NonNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String description;
	@NonNull
	@NotEmpty
	@Size(min = 3, max = 50)
	private String jailName;
	private String fileName;
	private long fileSize;
	private String contentType;
	
	
	public CriminalEntity(@NonNull @NotEmpty @Size(min = 3, max = 50) String criminalName,
			@NonNull @NotEmpty @Size(min = 3, max = 50) String crime, int totalYearAwarded,
			@NonNull @NotEmpty @Size(min = 3, max = 50) String aliasName,
			@NonNull @NotEmpty @Size(min = 3, max = 50) String description,
			@NonNull @NotEmpty @Size(min = 3, max = 50) String jailName, String fileName, long fileSize,
			String contentType) {
		super();
		this.criminalName = criminalName;
		this.crime = crime;
		this.totalYearAwarded = totalYearAwarded;
		this.aliasName = aliasName;
		this.description = description;
		this.jailName = jailName;
		this.fileName = fileName;
		this.fileSize = fileSize;
		this.contentType = contentType;
	}
	
	

	
	
	
}
