package com.xworkz.register.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.xworkz.register.dto.ImageDTO;
import com.xworkz.register.dto.PatientDetailDTO;
import com.xworkz.register.repo.PatientDetailRepo;
import com.xworkz.register.service.PatientDetailService;

@Component
@RequestMapping("/save")
public class PatientDetailController {

	@Autowired
	private PatientDetailService service;

	public PatientDetailController() {
		System.out.println("Created PatientDetailController");
	}

	@PostMapping
	public String onSend(PatientDetailDTO dto, HttpServletRequest request,@RequestParam MultipartFile image) {
		System.out.println("Exicuted onSend...");
		if (image != null) {
			// Get the file and save it somewhere
							
			byte[] bytes;
			System.out.println("File original name" + image.getOriginalFilename());
			System.out.println("File size" + image.getSize());
			System.out.println("File type" + image.getContentType());
			String fileName=System.currentTimeMillis() + "_" + image.getOriginalFilename();
			try {
				bytes = image.getBytes();
				Path path = Paths.get("D:\\app-image\\" + fileName);
				Files.write(path, bytes);
				dto.setFileName(fileName);
				dto.setFileSize(image.getSize());
				dto.setContentType(image.getContentType());
				dto.setFileType(image.getContentType());
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			request.setAttribute("dto", dto);
		}		
		String message= service.validateAndSave(dto);
		if (message.equals("Success")) {
			request.setAttribute("message", "Patient Details saved successfully..");
			System.out.println("Patient Details" + dto);		
			
			return "save";
		} else {
			request.setAttribute("error", "Error in saving please check the email or mobile no");
			request.setAttribute("dto", dto);
		}
		return "index";
	}
		
	@GetMapping
	public String findByNameGreaterThanAgeOrLesserThanAge(@RequestParam String name, @RequestParam int greaterThanAge,
			@RequestParam int lesserThanAge, Model model) {
		System.out.println("Name selected from UI" + name);
		Optional<List<PatientDetailDTO>> optionalList = this.service.findByNameGreaterThanAgeOrLesserThanAge(name, greaterThanAge, lesserThanAge);
		if (optionalList.isPresent() && optionalList.get().size() > 0) {
			System.out.println("Data is present ");
			List<PatientDetailDTO> list = optionalList.get();
			System.out.println("Total List is found" + list.size());
			model.addAttribute("list", list);
		} else {
			System.out.println("Data is not present for " + name);
			model.addAttribute("message", "No Results found");

		}
		return "next";
	}
	
	@GetMapping(value="/files/{file_name}")
	public void getFile(@PathVariable("file_name") String fileName,@RequestParam String contentType, HttpServletResponse response) throws IOException {
		System.out.println("File name is"+fileName);
        Path uploadPath = Paths.get("D:\\app-image\\"+fileName);
         
      /*  if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }*/
        byte[] file=Files.readAllBytes(uploadPath);
        response.reset();
         
       /* try (InputStream inputStream = multipartFile.getInputStream()) {
            Path filePath = uploadPath.resolve(fileName);
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ioe) {        
            throw new IOException("Could not save image file: " + fileName, ioe);
        }  */   
        
        response.setContentType(contentType);
        
        try {
        	response.getOutputStream().write(file);
        }
        catch(IOException io) {
        	io.printStackTrace();
        }
    }

}
