package com.felipeweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeweb.curso.entities.Order;
import com.felipeweb.curso.repositories.OrderRepository;

@Service
public class OrderService {
	
	//injeção de dependencia do spring
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		 Optional<Order> obj = repository.findById(id);
		 return obj.get();// vai retornar o objeto tipado dentro de Optional
	}
}
