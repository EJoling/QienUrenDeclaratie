package com.mijnqiendatabase.qiendatabase.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tijdsformulier extends Formulier{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	public Set<Dag> getDagen() {
		return dagen;
	}
	public void setDagen(Set<Dag> dagen) {
		this.dagen = dagen;
	}
	public long getId() {
		return id;
	}
	private Set<Dag> dagen;
}