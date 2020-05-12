package com.felipeweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeweb.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
