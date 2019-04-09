package com.mijnqiendatabase.qiendatabase.service;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mijnqiendatabase.qiendatabase.domain.User;
import com.mijnqiendatabase.qiendatabase.repository.UserRepository;


@Service
@Transactional
public class UserService {

		@Autowired
		private UserRepository userRepository;

		
		public User save(User user) {
	     	return userRepository.save(user);
		}
		public void delete(User user) {
			userRepository.delete(user);;
		}
		public void deleteById(Long id) {
			userRepository.deleteById(id);
		}
		public Iterable<User> findAll() {
	     	return userRepository.findAll();
		}
		public Optional<User> findById(long id) {
	     	return userRepository.findById(id);
		}
		public User findByLogin(String username, String wachtwoord) {
	     	Iterable<User> users = userRepository.findByUsernameAndWachtwoord(username, wachtwoord);
	     	System.out.println(username + wachtwoord);
	     	User user = null;
	     	Iterator<User> x = users.iterator();
	     			while(x.hasNext()) {
	     				user = x.next();
	     			}
	     			System.out.println(user.getId());
	     	return user;
		}

	}
