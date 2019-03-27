package com.mijnqiendatabase.qiendatabase.domain;

import java.util.ArrayList;

public class Klant {
	private ArrayList<Trainee> trainee;// Een klant heeft een of meer trainees die bij hem werkt

	public void goedkeuren() {

	}

	public void afwijzen() {

	}

	public ArrayList<Trainee> getTrainee() {
		return trainee;
	}

	public void setTrainee(ArrayList<Trainee> trainee) {
		this.trainee = trainee;
	}

}
