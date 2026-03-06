package com.example.demo_azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAzureApplication {

	@GetMapping("/")
	public String home() {
		return "Your app deployed successfully!";
	}

	@GetMapping("/message")
	public String message() {
		return "Your app deployed successfully!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoAzureApplication.class, args);
	}
}
