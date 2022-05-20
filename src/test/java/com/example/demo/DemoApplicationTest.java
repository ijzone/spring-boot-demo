package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DemoApplicationTest {

	@Test
	void hello() {
		String hello = "Hello Bran";
		assertThat("Hello Bran").isEqualTo(hello);
	}

	@Test
	void personInfo() {
		Person person = new Person("Brandon", "M");
		Person person2 = new Person("Anonymous", "Unknown");
		Assertions.assertThat(person2.getName()).isEqualTo(person.getName());
	}

}
