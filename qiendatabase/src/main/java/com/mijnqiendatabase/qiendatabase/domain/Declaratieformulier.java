package com.mijnqiendatabase.qiendatabase.domain;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Declaratieformulier extends Formulier{
	
	@OneToMany
	private Set<Kosten> kosten;
	

	public Set<Kosten> getKosten() {
		return kosten;
	}
	
}