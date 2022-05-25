package com.tracert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracert.model.Avaliation;
import com.tracert.service.AvaliationService;

@RestController
@RequestMapping("/avaliation")
public class AvaliationController {

	@Autowired
	private AvaliationService service;
	
	@PostMapping(value="/insert",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void create(@RequestBody Avaliation body) {
		service.create(body);
	}
}
