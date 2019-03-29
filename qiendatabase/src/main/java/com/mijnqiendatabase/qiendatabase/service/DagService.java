package com.mijnqiendatabase.qiendatabase.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mijnqiendatabase.qiendatabase.domain.Dag;
import com.mijnqiendatabase.qiendatabase.repository.DagRepository;

@Service
@Transactional
public class DagService {

	@Autowired
	DagRepository dagRepository;
	
	public Dag save(Dag dag) {
		return dagRepository.save(dag);
	}
	
	public Iterable<Dag> findAll(){
		return dagRepository.findAll();
	}
	
	public Optional<Dag> findById(Long id){
		return dagRepository.findById(id);
	}
	
	public void deleteById(Long id) { 
		dagRepository.deleteById(id);
	}
}
