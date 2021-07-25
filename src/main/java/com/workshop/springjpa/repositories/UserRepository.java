package com.workshop.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.springjpa.entities.User;

/***
 * 
 * @author dionatan
 *
 */

public interface UserRepository extends JpaRepository<User, Long> {

}
