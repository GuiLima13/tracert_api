package com.tracert.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracert.model.Avaliation;
import com.tracert.model.Establishment;
import com.tracert.model.User;
import com.tracert.repository.AvaliationRepository;

@Service
public class AvaliationService {

	@Autowired
	private AvaliationRepository repository;

	@Autowired
	private UserService serviceUser;

	@Autowired
	private EstablishmentService serviceEstab;
	
	
	public <T> void create(Avaliation avaliation) {
		Establishment estab = serviceEstab.findByName(avaliation.getEstablishment().getName());
		User user = serviceUser.findByUsername(avaliation.getUser().getUsername());
		
		avaliation.setUser(user);
		avaliation.setEstablishment(estab);
		repository.save(avaliation);
	}
	
	public <T> List<T> avgAllAvaliation(){
		return  repository.findAllAvg();
	}
	
	public <T> List<T> findByEstabAvg(String name){
		return  repository.findByEstabAvg(name);
	}
	
	public <T> List<T> findTopFiveAvg(){
		return  repository.findTopFiveAvg();
	}
	
	
}
