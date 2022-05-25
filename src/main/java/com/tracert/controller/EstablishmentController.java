package com.tracert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracert.model.Establishment;
import com.tracert.service.AvaliationService;
import com.tracert.service.EstablishmentService;

@RestController
@RequestMapping("/establishment")
public class EstablishmentController<T> {

	@Autowired
	EstablishmentService service;

	@Autowired
	AvaliationService serviceAvaliation;
	
	@GetMapping(value = "/findAll",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<T> findAll(){
		return serviceAvaliation.avgAllAvaliation();
	}
	
	@GetMapping(value = "/findTopFive",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<T> findTopFive(){
		return serviceAvaliation.findTopFiveAvg();
	}

	@GetMapping(value = "/findByName{name}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<T> findByName(@PathVariable("name") String name){
		return serviceAvaliation.findByEstabAvg(name);
	}
	

	@PostMapping(value="/insert",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void insert(@RequestBody Establishment body) {
		service.create(body);
	}
}
