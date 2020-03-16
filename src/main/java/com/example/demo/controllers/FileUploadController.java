package com.example.demo.controllers;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.*;
import java.util.Date;

import com.example.demo.domain.CarPrice;	
import com.example.demo.services.CarService;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

@Controller
public class FileUploadController {
	
	@Autowired
	private CarService carService;

	//destination folder to upload the files
	private static String UPLOAD_FOLDER = "/home/siddharth/Desktop/Spring_Boot/upload/";

	@RequestMapping("/upload1")
	public ModelAndView showUpload() {
		return new ModelAndView("upload1");
	}

	@PostMapping("/upload1")
	public ModelAndView fileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

		if (file.isEmpty()) {
			return new ModelAndView("status", "message", "Please select a file and try again");
		}

		try {
			// read and write the file to the selected location-
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOAD_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);
			
			try{				
	        	Reader reader = Files.newBufferedReader(path);
	        	CSVReader csvreader = new CSVReaderBuilder(reader).withSkipLines(1).build();
	        	
	        	Date date = new Date();
	        	long time = date.getTime();
	        	Timestamp ts = new Timestamp(time);
	        	
	        	CarPrice si = new CarPrice();        	
                
                String[] nextRecord;
                while ((nextRecord = csvreader.readNext()) != null) {
                	si.setexshowroom_price(Double.parseDouble(nextRecord[0]));
                	si.setrto_charges(Double.parseDouble(nextRecord[1]));
                	si.setinsurance_charges(Double.parseDouble(nextRecord[2]));
                	si.setantitheft_charges(Double.parseDouble(nextRecord[3]));
                	si.setauto_card_charges(Double.parseDouble(nextRecord[4]));
                	si.setdrive_assure(Double.parseDouble(nextRecord[5]));
                	si.setessential_kit_charges(Double.parseDouble(nextRecord[6]));
                	si.setextended_warranty_charges(Double.parseDouble(nextRecord[7]));
                	si.sethandling_charges(Double.parseDouble(nextRecord[8]));
                	si.setlogistic_charges(Double.parseDouble(nextRecord[9]));
                	si.setmcd_charges(Double.parseDouble(nextRecord[10]));
                	si.setnumber_plate(Double.parseDouble(nextRecord[11]));
                	si.setonroad_price(Double.parseDouble(nextRecord[12]));               	
                	si.setsecure(Double.parseDouble(nextRecord[13]));
                	si.setsmart_card_charges(Double.parseDouble(nextRecord[14]));
                	si.setstandard_accessories_charges(Double.parseDouble(nextRecord[15]));
                	si.setstock_yard_charges(Double.parseDouble(nextRecord[16]));
                	si.setteflon_coating(Double.parseDouble(nextRecord[17]));
                	si.setwarehousing_charges(Double.parseDouble(nextRecord[18]));
                	si.setcity_id(Integer.parseInt(nextRecord[19]));
                	si.setvariant_id(Integer.parseInt(nextRecord[20]));
                	si.setend_date(Timestamp.valueOf(nextRecord[21]));
                	
                	si.setcreation_date(ts);
                	si.setlast_updated(ts);
                	
                	this.carService.saveAndFlush(si);
                	csvreader.close();
                }
                System.out.println("Data Successfully Uploaded");
	        }
	        catch (Exception e){
	            e.printStackTrace();
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}

		return new ModelAndView("status", "message", "File Uploaded sucessfully");
	}

}