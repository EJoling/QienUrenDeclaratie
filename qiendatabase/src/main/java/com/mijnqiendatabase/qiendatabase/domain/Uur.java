package com.mijnqiendatabase.qiendatabase.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

//import com.mijnqiendatabase.qiendatabase.domain.Tijdsformulier;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Uur implements Comparable<Uur>{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String waarde;//Gewerkte Uren 1, "Overuren 100%"2, "Overuren 125%"3, "Verlof Uren"4, "Ziekte Uren 5
	private int aantal;
	private LocalDate factuurDatum;  //EMIELdatum(stomme naaamgeving)
	private AccordOptie accordStatus = AccordOptie.NIETINGEVULD;
	
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
	
	public long getId() {
		return id;
	}
	public int getAantal() {
		return aantal;
	}
	public void setAantal(int aantal) {
		this.aantal = aantal;
	}
	public LocalDate getFactuurDatum() {
		return factuurDatum;
	}
	public void setFactuurDatum(LocalDate factuurDatum) {
		this.factuurDatum = factuurDatum;
	}
	public AccordOptie getAccordStatus() {
	return accordStatus;
	}
	public void setAccordStatus(AccordOptie accordStatus) {
		System.out.println(accordStatus);
	this.accordStatus = accordStatus;
	}
	@Override
	public int compareTo(Uur uur) {
		return this.factuurDatum.compareTo(uur.getFactuurDatum());
	}
	
}
