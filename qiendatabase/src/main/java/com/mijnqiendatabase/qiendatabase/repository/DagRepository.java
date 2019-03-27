package com.mijnqiendatabase.qiendatabase.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mijnqiendatabase.qiendatabase.domain.Dag;

@Repository
public interface DagRepository extends CrudRepository<Dag, Long> {

}
