package com.mijnqiendatabase.qiendatabase.domain;

import javax.persistence.*;
import java.time.LocalDate;

//import com.mijnqiendatabase.qiendatabase.domain.Tijdsformulier;
//import javax.persistence.FetchType;
//import javax.persistence.ManyToOne;


@Entity
public class Uur implements Comparable<Uur>{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String waarde;//Gewerkte Uren 1, "Overuren 100%"2, "Overuren 125%"3, "Verlof Uren"4, "Ziekte Uren 5
	private int aantal;
	private LocalDate factuurDatum;  //EMIELdatum(stomme naaamgeving)

	@Enumerated(value = EnumType.STRING)
	private AccordOptie accordStatus = AccordOptie.NIETINGEVULD;

	@ManyToOne
	private Trainee trainee;
	
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

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}
}
