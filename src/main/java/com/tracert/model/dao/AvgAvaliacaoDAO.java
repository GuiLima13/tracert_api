package com.tracert.model.dao;

import com.tracert.model.Establishment;

public class AvgAvaliacaoDAO {

	
	private Establishment establishment;
	private Double nota;
	
	
	
	public AvgAvaliacaoDAO(Establishment establishment, Double nota) {
		super();
		this.establishment = establishment;
		this.nota = nota;
	}
	public AvgAvaliacaoDAO() {
	}
	public Establishment getEstablishment() {
		return establishment;
	}
	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	
}
