package com.mijnqiendatabase.qiendatabase.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Formulier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private String opmerkingen; //opmerkingenveld voor bijvoorbeeld afspraken tussen trainee/werknemer en Qien
	private int periode;		//periode van declareren. dit voor nu per maand waarbij int=1 is de maand januari. Eventueel lateroplossing voor verzinnen
	public String getOpmerkingen() {
		return opmerkingen;
	}
	public void setOpmerkingen(String opmerkingen) {
		this.opmerkingen = opmerkingen;
	}
	public int getPeriode() {
		return periode;
	}
	public void setPeriode(int periode) {
		this.periode = periode;
	}
	public long getId() {
		return id;
	}
	
	
}
