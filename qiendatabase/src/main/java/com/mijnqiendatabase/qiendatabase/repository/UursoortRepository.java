package com.mijnqiendatabase.qiendatabase.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mijnqiendatabase.qiendatabase.domain.Uursoort;

@Repository
public interface UursoortRepository extends CrudRepository<Uursoort, Long>{

}
