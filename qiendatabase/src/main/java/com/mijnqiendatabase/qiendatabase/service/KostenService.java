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
	KostenRepository kostenrepository;
	
	public Kosten save(Kosten kosten) {
		return kostenrepository.save(kosten);
	}
	
	public Iterable<Kosten> findAll(){
		return kostenrepository.findAll();
	}
	
	public Optional<Kosten> findById(Long id){
		return kostenrepository.findById(id);
	}
	
	public void deleteById(Long id) { 
		kostenrepository.deleteById(id);
	}
	
}


