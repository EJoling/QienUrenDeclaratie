package com.mijnqiendatabase.qiendatabase.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mijnqiendatabase.qiendatabase.domain.Trainee;

@Repository
public interface TraineeRepository extends CrudRepository<Trainee, Long> {

}
