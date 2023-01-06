package com.danielsantos.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.danielsantos.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User daniel = new User("1", "Daniel Teste", "daniel@gmail.com");
		User eliciane = new User("2", "Eliciane Teste", "Eliciane@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(daniel, eliciane));
		return ResponseEntity.ok().body(list);
	}

}
