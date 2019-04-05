package com.mijnqiendatabase.qiendatabase.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Kosten {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Kostensoort kostensoort;
	private int bedrag; //in eurocenten. dit bedrag moet vast staan voor auto (0,19 euro voor nu) 
						//admin moet dit bedrag kunnen veranderen. Voor alle andere kosten is het bedrag opgegeven door de trainee.
	private int aantal;//het aantal km's, bij ov is dit standaard 1.
	private LocalDate factuurDatum; //krijgt huidige datum
	private int factuurnummer;
	
	
	public void berekenen() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getBedrag() {
		return bedrag;
	}
	public void setBedrag(int bedrag) {
		this.bedrag = bedrag;
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
	public int getFactuurnummer() {
		return factuurnummer;
	}
	public void setFactuurnummer(int factuurnummer) {
		this.factuurnummer = factuurnummer;
	}
	public Kostensoort getKostensoort() {
		return kostensoort;
	}
	
	public void setKostensoort(Kostensoort kostensoort) {
		this.kostensoort = kostensoort;
	}
	
	
}