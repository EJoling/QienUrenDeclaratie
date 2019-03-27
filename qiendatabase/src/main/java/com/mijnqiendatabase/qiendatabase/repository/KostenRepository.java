package com.mijnqiendatabase.qiendatabase.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mijnqiendatabase.qiendatabase.domain.Kosten;

@Repository
public interface KostenRepository extends CrudRepository<Kosten, Long> {

}
