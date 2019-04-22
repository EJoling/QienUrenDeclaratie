package com.mijnqiendatabase.qiendatabase.domain;

import javax.persistence.Entity;

@Entity
public class Admin extends User {
	public Admin() {
		this.setRol("admin");
	}

	public void accountAanmaken() {
	}

	public void dataBeheren() {
	}

	public void exporteren() {
	}

}
