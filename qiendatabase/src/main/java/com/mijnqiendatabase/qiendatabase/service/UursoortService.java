package com.mijnqiendatabase.qiendatabase.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mijnqiendatabase.qiendatabase.domain.Uursoort;
import com.mijnqiendatabase.qiendatabase.repository.UursoortRepository;

@Service
@Transactional
public class UursoortService {
	@Autowired
	private UursoortRepository uursoortRepository;

	
	public Uursoort save(Uursoort uursoort) {
     	return uursoortRepository.save(uursoort);
	}
	public void deleteById(Long id) {
		uursoortRepository.deleteById(id);
	}
	public Iterable<Uursoort> findAll() {
     	return uursoortRepository.findAll();
	}
	public Optional<Uursoort> findById(long id) {
     	return uursoortRepository.findById(id);
	}
}
