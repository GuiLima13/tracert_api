package com.tracert.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tracert.model.Establishment;

public interface EstablishmentRepository extends JpaRepository<Establishment, Long>{

	Establishment findByName(String name);

}
