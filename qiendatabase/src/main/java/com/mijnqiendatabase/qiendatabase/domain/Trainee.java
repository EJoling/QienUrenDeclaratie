package com.mijnqiendatabase.qiendatabase.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Trainee extends User {

	private int loon; // in centen
	private int type; // bijv Masterclass of gedetacheerd, ivm reiskostenvergoeding
//	private Set<TijdsFormulier> tijdsformulier;
//	private Set<DeclaratieFormulier> declaraties;
	@OneToMany
	private Set<Klant> klant; // een trainee werkt bij 1 of meer klanten

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

//	public ArrayList<TijdsFormulier> getTijdsformulier() {
//		return tijdsformulier;
//	}
//	public void setTijdsformulier(ArrayList<TijdsFormulier> tijdsformulier) {
//		this.tijdsformulier = tijdsformulier;
//	}
//	public ArrayList<DeclaratieFormulier> getDeclaraties() {
//		return declaraties;
//	}
//	public void setDeclaraties(ArrayList<DeclaratieFormulier> declaraties) {
//		this.declaraties = declaraties;
//	}

}
