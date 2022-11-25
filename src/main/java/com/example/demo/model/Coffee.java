package com.example.demo.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * 
 * @author IB
 *
 */
@Entity
public class Coffee {
	@Id
	private String id;
	private String name;
	
	
	public Coffee() {
		//TODO Auto-generated constructor stub
	}

	public Coffee(String id, String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
	}

	public Coffee(String name) {
		this(UUID.randomUUID().toString(), name);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
