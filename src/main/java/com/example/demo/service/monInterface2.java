package com.example.demo.service;

import java.util.List;

import javax.annotation.PostConstruct;

import com.example.demo.model.Coffee;

public interface monInterface2 {

	void initDB();

	List<Coffee> getAllCoffees();

	List<Coffee> getCoffeesByName(String name);

	void saveCoffee(Coffee coffee);

}