package com.demojava.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LaerningApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome here";
	}

	public static void main(String[] args) {
		SpringApplication.run(LaerningApplication.class, args);
	}

}
