package com.mijnqiendatabase.qiendatabase.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Trainee extends User {

	private int loon; // in centen
	private int type; // bijv Masterclass of gedetacheerd, ivm reiskostenvergoeding
	
	@JsonIgnoreProperties("trainee")
	@ManyToOne 
	private Klant klant; // een trainee werkt bij 1 of meer klanten
	@OneToMany (fetch = FetchType.EAGER) //geen idee of eager fetchen nodig is, anders haal ik het nog wel weg
	private Set<Uur> uren; // nieuw, een trainee heeft gewerkte uren ipv tijdsformulieren

	@OneToMany (fetch = FetchType.EAGER)
	private Set<Kosten> kosten; // Jordi


	public Set<Kosten> getKosten() {
		return kosten;
	}

	public void setKosten(Set<Kosten> kosten) {
		this.kosten = kosten;
	}


	public int getLoon() {
		return loon;
	}

	public void setLoon(int loon) {
		this.loon = loon;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Set<Uur> getUren() {
	return uren;
	}
	
	public void setUren(Set<Uur> uren) {
	this.uren = uren;
	}	

	public Klant getKlant() {
		return klant;
	}

	public void setKlant(Klant klant) {
		this.klant = klant;
  }
}
