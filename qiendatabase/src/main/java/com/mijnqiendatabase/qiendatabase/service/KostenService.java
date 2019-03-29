package com.mijnqiendatabase.qiendatabase.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mijnqiendatabase.qiendatabase.domain.Kosten;
import com.mijnqiendatabase.qiendatabase.repository.KostenRepository;



@Service
@Transactional
public class KostenService {
	@Autowired
	KostenRepository kostenRepository;
	
	public Kosten save(Kosten kosten) {
		return kostenRepository.save(kosten);
	}
	
	public Iterable<Kosten> findAll(){
		return kostenRepository.findAll();
	}
	
	public Optional<Kosten> findById(Long id){
		return kostenRepository.findById(id);
	}
	
	public void deleteById(Long id) { 
		kostenRepository.deleteById(id);
	}
	
}


