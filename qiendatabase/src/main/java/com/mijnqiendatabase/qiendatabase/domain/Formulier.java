package com.mijnqiendatabase.qiendatabase.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formulier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
}
