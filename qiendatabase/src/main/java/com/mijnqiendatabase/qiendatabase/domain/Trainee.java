package com.mijnqiendatabase.qiendatabase.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Trainee extends User {

	private int loon; // in centen
	private int type; // bijv Masterclass of gedetacheerd, ivm reiskostenvergoeding
	
	@JsonIgnore @OneToMany (fetch = FetchType.EAGER)
	private Set<Tijdsformulier> tijdsformulier;
	@JsonIgnore @OneToMany (fetch = FetchType.EAGER)
	private Set<Declaratieformulier> declaraties;
	@OneToMany (fetch = FetchType.EAGER)
	private Set<Klant> klant; // een trainee werkt bij 1 of meer klanten
	@OneToMany (fetch = FetchType.EAGER) //geen idee of eager fetchen nodig is, anders haal ik het nog wel weg
	private Set<Uur> uren; // nieuw, een trainee heeft gewerkte uren ipv tijdsformulieren
	private boolean heeftUrenVerstuurd;

	public boolean isHeeftUrenVerstuurd() {
		return heeftUrenVerstuurd;
	}

	public void setHeeftUrenVerstuurd(boolean heeftUrenVerstuurd) {
		this.heeftUrenVerstuurd = heeftUrenVerstuurd;
	}

	public Set<Uur> getUren() {
		return uren;
	}

	public void setUren(Set<Uur> uren) {
		this.uren = uren;
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

	public Set<Klant> getKlant() {
		return klant;
	}

	public void setKlant(Set<Klant> klant) {
		this.klant = klant;
	}

	public Set<Tijdsformulier> getTijdsformulier() {
		return tijdsformulier;
	}
	public void setTijdsformulier(Set<Tijdsformulier> tijdsformulier) {
		this.tijdsformulier = tijdsformulier;
	}
	public Set<Declaratieformulier> getDeclaraties() {
		return declaraties;
	}
	public void setDeclaraties(Set<Declaratieformulier> declaraties) {
		this.declaraties = declaraties;
	}

}
