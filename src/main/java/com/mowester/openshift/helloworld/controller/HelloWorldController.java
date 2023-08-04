package com.mowester.openshift.helloworld.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot + Openshift!";
	}

	@PostMapping
	public String name(@RequestParam("name") String name) {
		return "Greetings from Spring Boot + Openshift! name" + name;
	}

}