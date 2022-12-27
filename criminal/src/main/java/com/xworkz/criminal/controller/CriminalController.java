package com.xworkz.criminal.controller;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.criminal.dto.CriminalEntity;
import com.xworkz.criminal.service.CriminalService;


@Component
@RequestMapping("/criminal")
public class CriminalController {
	
	@Autowired
	private CriminalService serv;
	
	
	public CriminalController() {
		System.out.println("Creating CriminalController using default controller");
	}

	@PostMapping
	public String onSend(CriminalEntity entity,Model model,@RequestParam MultipartFile file) {
			System.out.println("Exicuted onSend");
			if (file != null) {						
				byte[] bytes;
				System.out.println("File original name" + file.getOriginalFilename());
				System.out.println("File size" + file.getSize());
				System.out.println("File type" + file.getContentType());
				String fileName=System.currentTimeMillis() + "_" + file.getOriginalFilename();
				try {
					bytes = file.getBytes();
					Path path = Paths.get("D:\\Criminal-images\\" + fileName);
					Files.write(path, bytes);
					entity.setFileName(fileName);
					entity.setFileSize(file.getSize());
					entity.setContentType(file.getContentType());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				model.addAttribute("entity", entity);
			}
			boolean valid = serv.validateAndSave(entity);
			if (valid) {
				model.addAttribute("message", "Data is valid and saved succesfully..");
				System.out.println("Controlling Dto :" + entity);
			} else {
				model.addAttribute("error", "Criminal data not valid please check the data..");
				model.addAttribute("entity", entity);
			}
			return "index";					
	}

	
	@GetMapping
	public String fingByCriminalNameAndJailName(@RequestParam String criminalName,@RequestParam String jailName, Model model) {
		System.out.println("fingByCriminalNameAndJailName is running");
		Optional<List<CriminalEntity>> option = this.serv.fingByCriminalNameAndJailName(criminalName, jailName);
		if (option.isPresent() && option.get().size() > 0) {
			System.out.println("Data is present");
			List<CriminalEntity> list = option.get();
			System.out.println("Total list found" + list.size());
			model.addAttribute("list", list);
			//model.addAttribute("msg", "Result found");
			//return "next";
			
		} else {
			System.err.println("Data is not present" + criminalName);
			model.addAttribute("message", "No result found");
			
		}
		return "next";
	}
			
//retrieve the file
	@GetMapping(value="/files/{file_name}")
	public void getFile(@RequestParam("file_name") String fileName,@RequestParam String contentType,HttpServletResponse response) throws IOException {
		
		System.out.println("File name is"+fileName);
		Path path=Paths.get("D://criminal-images\\" + fileName);
		byte[] doc=Files.readAllBytes(path);
		//File file=new File("D://criminal-images/" + fileName);
		response.reset();
		response.setContentType(contentType);
		try {
        	response.getOutputStream().write(doc);
        	response.getContentType();
        }
        catch(IOException io) {
        	io.printStackTrace();
        }
	}
	
	
	/*@GetMapping
	public String findPriceByPlace(@RequestParam String place,Model model) {
		System.out.println("Place selected from UI"+place);
		Optional<List<OyoDTO>> option= this.oyoService.findPriceByPlace(place);
		if(option.isPresent()&& option.get().size()>0) {
			System.out.println("Data is present");
			List<OyoDTO> list=option.get();
			System.out.println("Total list found"+ list.size());
			model.addAttribute("list", list);
			return "searchResult";
		}
		else {
			System.out.println("Data is not present");
			model.addAttribute("message", "result not found");
			return "next";
		}
		
	}*/
	
	/*public String submit(@RequestParam("files") MultipartFile[] files, ModelMap modelMap) {
	    modelMap.addAttribute("files", files);
	    return "index";
	}*/
	
	
	
}
