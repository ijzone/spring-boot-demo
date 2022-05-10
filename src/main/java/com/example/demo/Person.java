package com.example.demo;

import lombok.Getter;

@Getter
public class Person {

	private String name;
	private String gender;
	
	Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
}
