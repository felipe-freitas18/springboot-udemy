package com.felipeweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeweb.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
