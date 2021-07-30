package com.workshop.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.springjpa.entities.Product;

/***
 * 
 * @author dionatan
 *
 */

public interface ProductRepository extends JpaRepository<Product, Long>{

}
