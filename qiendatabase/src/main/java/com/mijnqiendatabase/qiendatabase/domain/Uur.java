package com.mijnqiendatabase.qiendatabase.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Uur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private int waarde;
	private Uursoort uursoort;
	private Klant klant;
	
	
	public int getWaarde() {
		return waarde;
	}
	public void setWaarde(int waarde) {
		this.waarde = waarde;
	}
	public Uursoort getUursoort() {
		return uursoort;
	}
	public void setUursoort(Uursoort uursoort) {
		this.uursoort = uursoort;
	}
	public Klant getKlant() {
		return klant;
	}
	public void setKlant(Klant klant) {
		this.klant = klant;
	}
	public long getId() {
		return id;
	}
	
}
