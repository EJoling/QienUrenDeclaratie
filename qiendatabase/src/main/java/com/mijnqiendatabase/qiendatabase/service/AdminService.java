package com.mijnqiendatabase.qiendatabase.service;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mijnqiendatabase.qiendatabase.domain.Admin;
import com.mijnqiendatabase.qiendatabase.domain.Kosten;
import com.mijnqiendatabase.qiendatabase.domain.Kostensoort;
import com.mijnqiendatabase.qiendatabase.repository.AdminRepository;

@Service
@Transactional
public class AdminService {
	@Autowired
	private KostensoortService kostensoortservice;
	
	@Autowired
	private KostenService kostenservice;
	
	@Autowired
	private AdminRepository adminRepository;

	
	public Admin save(Admin admin) {
     	return adminRepository.save(admin);
	}
	public void delete(Admin admin) {
     	adminRepository.delete(admin);;
	}
	public void deleteById(Long id) {
		adminRepository.deleteById(id);
	}
	public Iterable<Admin> findAll() {
     	return adminRepository.findAll();
	}
	public Optional<Admin> findById(long id) {
     	return adminRepository.findById(id);
	}

}
