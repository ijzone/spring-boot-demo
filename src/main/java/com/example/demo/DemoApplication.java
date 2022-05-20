package com.example.demo;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s", name);
	}
	
	@GetMapping({"/person", "/person/{id}"})
	public Person personInfo(@PathVariable(value = "id", required = false) String id) {
		if(id == null) {
			return new Person("Anonymous", "N/A");
		}
		
		return new Person("Brandon", "M");
	}
	
	@GetMapping(value = "/cookie")
	public String cookie(HttpServletResponse resp) {
		String name = "cookie_test";
		String value = "cookie_values";
		Cookie cookie = new Cookie(name, value);
		cookie.setDomain("ijzone.dev");
		resp.addCookie(cookie);
		
		return String.format("%s", "Cookie");
	}
}
