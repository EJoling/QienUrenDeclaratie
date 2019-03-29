package com.mijnqiendatabase.qiendatabase.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dag {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToMany(fetch = FetchType.EAGER)
	private Set<Uur> uren;
	private boolean betaaldeDag;
	
	public void maxUrenCheck() {
		
	}
	
	public Set<Uur> getUren() {
		return uren;
	}
	public void setUren(Set<Uur> uren) {
		this.uren = uren;
	}
	public boolean isBetaaldeDag() {
		return betaaldeDag;
	}
	public void setBetaaldeDag(boolean betaaldeDag) {
		this.betaaldeDag = betaaldeDag;
	}
	public long getId() {
		return id;
	}
	
}
