package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Coffee;
import com.example.demo.service.IService;

@RestController
@RequestMapping("/coffees")
public class RestApiDemoController {

	private IService serviceImpl;

	public RestApiDemoController(IService serviceImpl) {
		this.serviceImpl = serviceImpl;
	}

	
	
	
	
	
	
	
//	private List<Coffee> coffees = new ArrayList<>();

	@GetMapping
	Iterable<Coffee> getCoffees() {
		return serviceImpl.getAllCoffees();
	}

	
	
	
	
	
	
	
	
	
	
	@GetMapping("/name/{name}")
	public List<Coffee> coffeeByName2(@PathVariable String name) {
		return serviceImpl.getCoffeesByName(name);
	}
	
	


//	@GetMapping("/{id}")
//	Optional<Coffee> getCoffeeById(@PathVariable String id) {
//		Optional<Coffee> o;
//		for (Coffee c : coffees) {
//			if (c.getId().equals(id)) {
//				return Optional.of(c);
//			}
//		}
//
//		return Optional.empty();
//		
//		
//	}

//	@GetMapping("/{id}")
//	ResponseEntity<Coffee> getCoffeeById(@PathVariable String id) {
//		Coffee coffee = null;
//		for (Coffee c : coffees) {
//			if (c.getId().equals(id)) {
//				coffee = c;
//			}
//		}
//
//		Optional<Coffee> o = Optional.ofNullable(coffee);
//
//		return o.map(c -> ResponseEntity.ok().body(c)).orElse(ResponseEntity.notFound().build());
//
//	}

	@PostMapping
	Coffee postCoffee(@RequestBody Coffee coffee) {
		serviceImpl.saveCoffee(coffee);
		return coffee;
	}

//	@PutMapping("/{id}")
//	ResponseEntity<Coffee> putCoffee(@PathVariable String id, @RequestBody Coffee coffee) {
//		int coffeeIndex = -1;
//
//		for (Coffee c : coffees) {
//			if (c.getId().equals(id)) {
//				coffeeIndex = coffees.indexOf(c);
//				coffees.set(coffeeIndex, coffee);
//			}
//		}
//
//		return (coffeeIndex == -1) ? new ResponseEntity<>(postCoffee(coffee), HttpStatus.CREATED)
//				: new ResponseEntity<>(coffee, HttpStatus.OK);
//	}

//	@DeleteMapping("/{id}")
//	void deleteCoffee(@PathVariable String id) {
//		coffees.removeIf(c -> c.getId().equals(id));
//	}

//	@DeleteMapping("/{id}")
//	ResponseEntity<Boolean> deleteCoffee(@PathVariable String id) {
//		boolean result = coffees.removeIf(c -> c.getId().equals(id));
//		return result ? new ResponseEntity<>(result, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	}

}
