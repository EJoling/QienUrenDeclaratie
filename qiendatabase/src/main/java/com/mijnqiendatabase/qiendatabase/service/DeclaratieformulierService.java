package com.mijnqiendatabase.qiendatabase.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mijnqiendatabase.qiendatabase.domain.Declaratieformulier;
import com.mijnqiendatabase.qiendatabase.repository.DeclaratieformulierRepository;

import java.util.Optional;

import javax.transaction.Transactional;

@Service
@Transactional
public class DeclaratieformulierService {
	@Autowired
	DeclaratieformulierRepository declaratieformulierrepository;
	
	public Declaratieformulier save(Declaratieformulier declaratieform) {
		return declaratieformulierrepository.save(declaratieform);
	}
	
	public Iterable<Declaratieformulier> findAll(){
		return declaratieformulierrepository.findAll();
	}
	
	public Optional<Declaratieformulier> findById(Long id){
		return declaratieformulierrepository.findById(id);
	}
	
	public void deleteById(Long id) {
		declaratieformulierrepository.deleteById(id);
	}
	
}
