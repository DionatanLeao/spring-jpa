package com.workshop.springjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.springjpa.entities.OrderItem;

/***
 * 
 * @author dionatan
 *
 */

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
