package com.mijnqiendatabase.qiendatabase.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Uursoort {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private boolean declarabel;
	private String omschrijving;
	
	public boolean getDeclarabel() {
		return declarabel;
	}
	public void setDeclarabel(boolean declarabel) {
		this.declarabel = declarabel;
	}
	public String getOmschrijving() {
		return omschrijving;
	}
	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}
	public long getId() {
		return id;
	}
}
