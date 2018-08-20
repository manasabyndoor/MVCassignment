package com.demo.rest.service;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
	@RequestMapping("/hello")
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
