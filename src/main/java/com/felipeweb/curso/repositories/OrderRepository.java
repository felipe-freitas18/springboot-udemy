package com.felipeweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeweb.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
