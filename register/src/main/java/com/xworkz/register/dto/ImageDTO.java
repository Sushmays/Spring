package com.xworkz.register.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="patient_db")
public class ImageDTO {
	
	@Id
	private String fileName;
	private byte[] fileSize;
	private String fileType;
	private String contentType;

}
