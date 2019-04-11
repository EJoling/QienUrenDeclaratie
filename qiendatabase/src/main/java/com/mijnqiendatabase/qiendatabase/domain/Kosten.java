package com.mijnqiendatabase.qiendatabase.domain;

import java.time.LocalDate;

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
	private LocalDate factuurDatum; //krijgt huidige datum
	private int aantalKM;//het aantal km's, bij ov is dit standaard 1.
	private int bedrag;	//in eurocenten. dit bedrag moet vast staan voor auto (0,19 euro voor nu) 
						//admin moet dit bedrag kunnen veranderen. Voor alle andere kosten is het bedrag opgegeven door de trainee.
	private String status;
	
//	private LocalDateTime factuurDatum = LocalDateTime.now(); //krijgt huidige datum
//	@ManyToOne(fetch = FetchType.EAGER)
//	private Kostensoort kostensoort;
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getBedrag() {
		return bedrag;
	}

	public void setBedrag(int bedrag) {
		this.bedrag = bedrag;
	}

	public LocalDate getFactuurDatum() {
		return factuurDatum;
	}
	public void setFactuurDatum(LocalDate factuurDatum) {

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