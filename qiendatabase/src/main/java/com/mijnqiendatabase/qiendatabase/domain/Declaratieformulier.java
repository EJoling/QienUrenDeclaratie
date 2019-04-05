package com.mijnqiendatabase.qiendatabase.domain;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Declaratieformulier extends Formulier{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToMany(fetch = FetchType.EAGER)
	private Set<Kosten> kosten;
	private String test;
	

	public String getTest() {
		return test;
	}


	public void setTest(String test) {
		this.test = test;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public void setKosten(Set<Kosten> kosten) {
		this.kosten = kosten;
	}


	public Set<Kosten> getKosten() {
		return kosten;
	}
	
}