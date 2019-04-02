package com.mijnqiendatabase.qiendatabase.domain;

import java.time.LocalDateTime;

//import com.mijnqiendatabase.qiendatabase.domain.Tijdsformulier;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;

@Entity
public class Uur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String omschrijving;
	private String waarde;//Gewerkte Uren 1, "Overuren 100%"2, "Overuren 125%"3, "Verlof Uren"4, "Ziekte Uren 5
	private int aantal;
	private LocalDateTime factuurDatum; //krijgt huidige datum

	
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	private Uursoort uursoort;
//	@ManyToOne(fetch = FetchType.EAGER)
//	private Klant klant;
	
//	
//	public Tijdsformulier getTijdsformulier() {
//		return tijdsformulier;
//	}
//	public void setTijdsformulier(Tijdsformulier tijdsformulier) {
//		this.tijdsformulier = tijdsformulier;
//	}
	public String getWaarde() {
		return waarde;
	}
	public void setWaarde(String waarde) {
		this.waarde = waarde;
	}
	public String getOmschrijving() {
		return omschrijving;
	}
	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}
	
	
//	public Uursoort getUursoort() {
//		return uursoort;
//	}
//	public void setUursoort(Uursoort uursoort) {
//		this.uursoort = uursoort;
//	}
//	public Klant getKlant() {
//		return klant;
//	}
//	public void setKlant(Klant klant) {
//		this.klant = klant;
//	}
	public long getId() {
		return id;
	}
	public int getAantal() {
		return aantal;
	}
	public void setAantal(int aantal) {
		this.aantal = aantal;
	}
	public LocalDateTime getFactuurDatum() {
		return factuurDatum;
	}
	public void setFactuurDatum(LocalDateTime factuurDatum) {
		this.factuurDatum = factuurDatum;
	}
	
}
