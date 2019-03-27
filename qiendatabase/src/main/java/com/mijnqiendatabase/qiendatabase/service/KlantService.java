package com.mijnqiendatabase.qiendatabase.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mijnqiendatabase.qiendatabase.domain.Klant;
import com.mijnqiendatabase.qiendatabase.repository.KlantRepository;

@Service
@Transactional
public class KlantService {

	@Autowired
	private KlantRepository klantRepository;

	
	public Klant save(Klant klant) {
     	return klantRepository.save(klant);
	}
	public void delete(Klant klant) {
     	klantRepository.delete(klant);;
	}
	public void deleteById(Long id) {
		klantRepository.deleteById(id);
	}
	public Iterable<Klant> findAll() {
     	return klantRepository.findAll();
	}
	public Optional<Klant> findById(long id) {
     	return klantRepository.findById(id);
	}

}
