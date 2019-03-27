package com.mijnqiendatabase.qiendatabase.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Klant extends User{
	@OneToMany
	private Set<Trainee> trainee;// Een klant heeft een of meer trainees die bij hem werkt

	public void goedkeuren() {

	}

	public void afwijzen() {

	}

	public Set<Trainee> getTrainee() {
		return trainee;
	}

	public void setTrainee(Set<Trainee> trainee) {
		this.trainee = trainee;
	}

}
