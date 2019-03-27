package com.mijnqiendatabase.qiendatabase.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mijnqiendatabase.qiendatabase.domain.Kostensoort;
import com.mijnqiendatabase.qiendatabase.repository.KostensoortRepository;

@Service
@Transactional
public class KostensoortService {
	
	@Autowired
	KostensoortRepository kostensoortrepository;
	
	public Kostensoort save(Kostensoort kostensoort) {
		return kostensoortrepository.save(kostensoort);
	}
	
	public Iterable<Kostensoort> findAll(){
		return kostensoortrepository.findAll();
	}
	
	public Optional<Kostensoort> findById(Long id){
		return kostensoortrepository.findById(id);
	}
	
	public void deleteById(Long id) { 
		kostensoortrepository.deleteById(id);
	}
}
