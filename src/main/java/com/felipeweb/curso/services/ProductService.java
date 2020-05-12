package com.felipeweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeweb.curso.entities.Product;
import com.felipeweb.curso.repositories.ProductRepository;

@Service
public class ProductService {
	
	//injeção de dependencia do spring
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		 Optional<Product> obj = repository.findById(id);
		 return obj.get();// vai retornar o objeto tipado dentro de Optional
	}
}
