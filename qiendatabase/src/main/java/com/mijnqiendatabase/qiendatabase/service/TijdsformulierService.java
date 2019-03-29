package com.mijnqiendatabase.qiendatabase.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mijnqiendatabase.qiendatabase.domain.AccordOptie;
import com.mijnqiendatabase.qiendatabase.domain.Dag;
import com.mijnqiendatabase.qiendatabase.domain.Tijdsformulier;
import com.mijnqiendatabase.qiendatabase.repository.TijdsformulierRepository;

@Service
@Transactional
public class TijdsformulierService {

		@Autowired
		TijdsformulierRepository tijdsformulierRepository;
		
		public Tijdsformulier save(Tijdsformulier tijdsformulier) {
			return tijdsformulierRepository.save(tijdsformulier);
		}
		
		public Iterable<Tijdsformulier> findAll(){
			return tijdsformulierRepository.findAll();
		}
		
		public Optional<Tijdsformulier> findById(Long id){
			return tijdsformulierRepository.findById(id);
		}
		
		public void deleteById(Long id) { 
			tijdsformulierRepository.deleteById(id);
		}
		
//		@PostConstruct
//		public void iets() {
//			Tijdsformulier t = new Tijdsformulier();
//			Set<Dag> d = new HashSet<>(); 
//			t.setDagen(d);
//			t.setOpmerkingen("goed");
//			t.setPeriode(8);
//			t.setAccordStatus(AccordOptie.NIETINGEVULD);
//			tijdsformulierRepository.save(t);
//		}
		
}
