package com.workshop.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.springjpa.entities.Order;

/***
 * 
 * @author dionatan
 *
 */

public interface OrderRepository extends JpaRepository<Order, Long> {

}
