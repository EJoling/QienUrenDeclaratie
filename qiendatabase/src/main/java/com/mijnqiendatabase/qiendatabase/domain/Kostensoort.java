package com.mijnqiendatabase.qiendatabase.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Kostensoort {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private int type; //het type kosten (1 = auto, 2 = ov, 3 = overig)
	private boolean belastingvrij;
	private boolean declarabel;
	private int vergoedingspercentage;
	private String omschrijving; // uitleg waar de kosten van zijn
	private boolean opmerkingVerplicht; // bij overige kosten is dit verplicht
	//private boolean bijlageVerplicht; //verplicht bij alle kosten? bij auto ook?
	private String eenheid; //kan km of euro's zijn. wordt in setter bepaald.
	
	
	
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public boolean isBelastingvrij() {
		return belastingvrij;
	}
	public void setBelastingvrij(boolean belastingvrij) {
		this.belastingvrij = belastingvrij;
	}
	public boolean isDeclarabel() {
		return declarabel;
	}
	public void setDeclarabel(boolean declarabel) {
		this.declarabel = declarabel;
	}
	public int getVergoedingspercentage() {
		return vergoedingspercentage;
	}
	public void setVergoedingspercentage(int vergoedingspercentage) {
		this.vergoedingspercentage = vergoedingspercentage;
	}
	public String getOmschrijving() {
		return omschrijving;
	}
	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}
	public boolean isOpmerkingVerplicht() {
		return opmerkingVerplicht;
	}
	public void setOpmerkingVerplicht(boolean opmerkingVerplicht) {
		this.opmerkingVerplicht = opmerkingVerplicht;
	}
	public String getEenheid() {
		return eenheid;
	}
	public void setEenheid(String eenheid) {
		this.eenheid = eenheid;
	}
	public long getId() {
		return id;
	}
}
