package com.workshop.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.springjpa.entities.Category;

/***
 * 
 * @author dionatan
 *
 */

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
