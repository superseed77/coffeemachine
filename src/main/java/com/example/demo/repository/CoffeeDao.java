package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Coffee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeDao extends JpaRepository<Coffee, Long>  {

	List<Coffee> findByName(String name);
	
}
