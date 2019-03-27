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
	DeclaratieformulierRepository declaratieformulierRepository;
	
	public Declaratieformulier save(Declaratieformulier declaratieform) {
		return declaratieformulierRepository.save(declaratieform);
	}
	
	public Iterable<Declaratieformulier> findAll(){
		return declaratieformulierRepository.findAll();
	}
	
	public Optional<Declaratieformulier> findById(Long id){
		return declaratieformulierRepository.findById(id);
	}
	
	public void deleteById(Long id) {
		declaratieformulierRepository.deleteById(id);
	}
	
}
