package com.mijnqiendatabase.qiendatabase.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kosten {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String waarde; // Openbaar Vervoer, Overige kosten, Auto
	private LocalDateTime factuurDatum; //krijgt huidige datum
	private int aantalKM;//het aantal km's, bij ov is dit standaard 1.
	private double bedrag;	
	private String status;
	
	
//	private LocalDateTime factuurDatum = LocalDateTime.now(); //krijgt huidige datum
//	@ManyToOne(fetch = FetchType.EAGER)
//	private Kostensoort kostensoort;
	
	
	public LocalDateTime getFactuurDatum() {
		return factuurDatum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getBedrag() {
		return bedrag;
	}

	public void setBedrag(double bedrag) {
		this.bedrag = bedrag;
	}

	public void setFactuurDatum(LocalDateTime factuurDatum) {
		this.factuurDatum = factuurDatum;
	}

	public int getAantalKM() {
		return aantalKM;
	}

	public void setAantalKM(int aantalKM) {
		this.aantalKM = aantalKM;
	}

	public void berekenen() {
		
	}
	
	public String getWaarde() {
		return waarde;
	}

	public void setWaarde(String waarde) {
		this.waarde = waarde;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

}