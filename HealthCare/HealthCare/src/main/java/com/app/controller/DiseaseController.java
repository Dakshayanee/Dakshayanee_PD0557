package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Disease;
import com.app.service.IDiseaseService;

@RestController
@RequestMapping("/disease")
@CrossOrigin
public class DiseaseController {
	
	@Autowired
	private IDiseaseService disService;
	
	public DiseaseController() {
		System.out.println("in def ctor " + getClass());
	}
	
	@PostMapping
	public Disease addNewDisease(@RequestBody Disease dis ){
		return disService.addOrEditDisease(dis);
	}

}