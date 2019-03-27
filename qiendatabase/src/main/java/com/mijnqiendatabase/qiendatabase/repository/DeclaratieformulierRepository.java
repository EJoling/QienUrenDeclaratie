package com.mijnqiendatabase.qiendatabase.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mijnqiendatabase.qiendatabase.domain.Declaratieformulier;

@Repository
public interface DeclaratieformulierRepository extends CrudRepository<Declaratieformulier, Long>{
	
}
