package com.test.app.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/")
	public String root() {
		System.out.println("Root page");
		return "This is root page";
	}

	@GetMapping("/hello")
	public String hello() {
		System.out.println("Hello page");
		return "This is hello page";
	}
}
