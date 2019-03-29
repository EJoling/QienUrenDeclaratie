package com.mijnqiendatabase.qiendatabase.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tijdsformulier extends Formulier{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToMany(fetch = FetchType.EAGER)

	private Set<Dag> dagen;
	
	private AccordOptie accordStatus;

	
	public AccordOptie getAccordStatus() {
		return accordStatus;
	}
	public void setAccordStatus(AccordOptie accordStatus) {
		this.accordStatus = accordStatus;
	}
	public Set<Dag> getDagen() {
		return dagen;
	}
	public void setDagen(Set<Dag> dagen) {
		this.dagen = dagen;
	}
	public long getId() {
		return id;
	}
	
}
