package com.mijnqiendatabase.qiendatabase.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mijnqiendatabase.qiendatabase.domain.Formulier;
 

 
@Repository
public interface FormulierRepository extends CrudRepository<Formulier, Long> {
 
}
