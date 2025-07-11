package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String sayHello() {
	    System.out.println("GET /hello called");
	    return "Hello, World!";
	}

}
