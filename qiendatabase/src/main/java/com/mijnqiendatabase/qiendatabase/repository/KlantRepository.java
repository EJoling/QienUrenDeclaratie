package com.mijnqiendatabase.qiendatabase.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mijnqiendatabase.qiendatabase.domain.Klant;

@Repository
public interface KlantRepository extends CrudRepository<Klant, Long> {

}
