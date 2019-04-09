package com.mijnqiendatabase.qiendatabase.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mijnqiendatabase.qiendatabase.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	Iterable<User> findByUsernameAndWachtwoord(String username, String wachtwoord);
}
