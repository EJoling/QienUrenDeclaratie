package com.mijnqiendatabase.qiendatabase.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mijnqiendatabase.qiendatabase.domain.Uur;
import com.mijnqiendatabase.qiendatabase.repository.UurRepository;

@Service
@Transactional
public class UurService {

	@Autowired
	UurRepository uurRepository;
	
	public Uur save(Uur uur) {
     	return uurRepository.save(uur);
	}
	public void deleteById(Long id) {
		uurRepository.deleteById(id);
	}
	public Iterable<Uur> findAll() {
     	return uurRepository.findAll();
	}
	public Optional<Uur> findById(long id) {
     	return uurRepository.findById(id);
	}
	
}
