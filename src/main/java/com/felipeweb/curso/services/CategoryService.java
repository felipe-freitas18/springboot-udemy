package com.felipeweb.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeweb.curso.entities.Category;
import com.felipeweb.curso.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	//injeção de dependencia do spring
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		 Optional<Category> obj = repository.findById(id);
		 return obj.get();// vai retornar o objeto tipado dentro de Optional
	}
}
