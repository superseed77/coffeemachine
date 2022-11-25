package com.example.demo.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.example.demo.model.Coffee;
import com.example.demo.repository.CoffeeDao;

@Service
public class ServiceImpl implements IService, monInterface, monInterface2 {
	
	
	private CoffeeDao coffeeDao;
	

	@Override
	@PostConstruct
	public void initDB() {
		coffeeDao.saveAll(List.of(new Coffee("Café Cereza"), new Coffee("Café Ganador"), new Coffee("Café Lareño"),
				new Coffee("Café Três Pontas")));
	}
	
	
	
	
	
	
	
	

	public ServiceImpl(CoffeeDao coffeeDao) {
		this.coffeeDao = coffeeDao;
		System.out.println(this.getClass().getName());
	}



	@Override
	public List<Coffee> getAllCoffees() {
		
		return coffeeDao.findAll();
	}


	@Override
	public List<Coffee> getCoffeesByName(String name) {
		return coffeeDao.findByName(name);
	}


	@Override
	public void saveCoffee(Coffee coffee) {
		coffeeDao.save(coffee);
		
	}

}
