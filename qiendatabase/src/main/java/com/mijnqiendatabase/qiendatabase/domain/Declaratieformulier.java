package com.mijnqiendatabase.qiendatabase.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Declaratieformulier extends Formulier{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private ArrayList<Kosten> kosten;
	
	public long getId() {
		return id;
	}

	public ArrayList<Kosten> getKosten() {
		return kosten;
	}
	
}