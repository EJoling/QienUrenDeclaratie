package com.mijnqiendatabase.qiendatabase.domain;

import java.util.Set;

import com.mijnqiendatabase.qiendatabase.domain.Uur;
import javax.persistence.CascadeType;
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
	


//	private Set<Dag> dagen;
	@OneToMany(fetch = FetchType.EAGER)
	private Set<Uur> uren;	
	private String test;
//	private AccordOptie accordStatus;

	
//	public AccordOptie getAccordStatus() {
//		return accordStatus;
//	}
//	public void setAccordStatus(AccordOptie accordStatus) {
//		this.accordStatus = accordStatus;
//	}
	public Set<Uur> getUren() {
		return uren;
	}
//	public void addUur(Uur uur) {
//        uren.add(uur);
//        uur.setTijdsformulier(this);
//    }
	public void setUren(Set<Uur> uren) {
		this.uren = uren;
	}
	public long getId() {
		return id;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	
}
