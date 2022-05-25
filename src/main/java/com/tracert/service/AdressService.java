package com.tracert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracert.model.Adress;
import com.tracert.repository.AdressRepository;

@Service
public class AdressService {

	@Autowired
	AdressRepository repository;
	
	public Adress create(Adress adress) {
		return repository.save(adress);
	}
	
}
