package com.mijnqiendatabase.qiendatabase.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mijnqiendatabase.qiendatabase.domain.Trainee;
import com.mijnqiendatabase.qiendatabase.repository.TraineeRepository;

@Service
@Transactional
public class TraineeService {

	@Autowired
	private TraineeRepository traineeRepository;

	
	public Trainee save(Trainee trainee) {
     	return traineeRepository.save(trainee);
	}
	public void delete(Trainee trainee) {
     	traineeRepository.delete(trainee);;
	}
	public void deleteById(Long id) {
		traineeRepository.deleteById(id);
	}
	public Iterable<Trainee> findAll() {
     	return traineeRepository.findAll();
	}
	public Optional<Trainee> findById(long id) {
     	return traineeRepository.findById(id);
	}

}
