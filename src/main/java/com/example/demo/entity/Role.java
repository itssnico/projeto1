package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Role {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String name;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
