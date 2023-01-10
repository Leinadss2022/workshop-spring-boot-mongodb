package com.danielsantos.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielsantos.workshopmongo.domain.User;
import com.danielsantos.workshopmongo.repository.UserRepository;
import com.danielsantos.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService{
	
		
	@Autowired 
	private UserRepository repo;
	
	 public List<User> findAll(){
		 return repo.findAll();
	 }
	 
	 public User findById(String id) {
		 Optional<User> obj = repo.findById(id);
		 return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	 }
	
}
