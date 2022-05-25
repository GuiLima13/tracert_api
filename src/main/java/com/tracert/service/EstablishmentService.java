package com.tracert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracert.model.Adress;
import com.tracert.model.Establishment;
import com.tracert.repository.EstablishmentRepository;

@Service
public class EstablishmentService {

	@Autowired
	EstablishmentRepository repository;
	@Autowired
	AdressService serviceAdress;
	
	public void create(Establishment establishment) {
		Adress adress = serviceAdress.create(establishment.getAdress());
		establishment.setAdress(adress);
		repository.save(establishment);
	}
	
	public List<Establishment> findAll(){
		return repository.findAll();
	}
	
	public Establishment findByName(String name){
		return repository.findByName(name);
	}
	
	//public calculaNota
}
