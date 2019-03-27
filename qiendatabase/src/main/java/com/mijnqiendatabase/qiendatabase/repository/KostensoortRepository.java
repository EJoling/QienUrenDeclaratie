package com.mijnqiendatabase.qiendatabase.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mijnqiendatabase.qiendatabase.domain.Kostensoort;

@Repository
public interface KostensoortRepository extends CrudRepository<Kostensoort, Long> {

}
