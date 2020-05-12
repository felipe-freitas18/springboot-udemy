package com.felipeweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeweb.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
