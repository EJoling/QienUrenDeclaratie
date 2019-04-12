package com.mijnqiendatabase.qiendatabase.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Klant extends User{
	@JsonIgnoreProperties("klant")
	@OneToMany (fetch = FetchType.EAGER)
	private Set<Trainee> trainee;// Een klant heeft een of meer trainees die bij hem werkt

	private String bedrijf;
	
	public String getBedrijf() {
		return bedrijf;
	}

	public void setBedrijf(String bedrijf) {
		this.bedrijf = bedrijf;
	}

	public void goedkeuren() {

	}

	public Set<Trainee> getTrainee() {
		return trainee;
	}

	public void setTrainee(Set<Trainee> trainee) {
		this.trainee = trainee;
	}

}
