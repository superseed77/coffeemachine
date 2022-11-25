package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Coffee;

public interface IService {
	
	List<Coffee> getAllCoffees();
	
	List<Coffee> getCoffeesByName(String name);
	
	void saveCoffee(Coffee coffee);
	

}
