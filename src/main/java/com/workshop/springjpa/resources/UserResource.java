package com.workshop.springjpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.springjpa.entities.User;

/***
 * 
 * @author dionatan
 *
 */

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@email", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}
