package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Coffee;
import com.example.demo.repository.CoffeeDao;

public class ServiceImpl0 implements IService {
	
	
	private CoffeeDao coffeeDao;


	public ServiceImpl0(CoffeeDao coffeeDao) {
		this.coffeeDao = coffeeDao;
		System.out.println(this.getClass().getName()+"!!!!");

	}

	
	
	
	
	@Override
	public List<Coffee> getAllCoffees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Coffee> getCoffeesByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCoffee(Coffee coffee) {
		coffeeDao.save(coffee);

	}

}
