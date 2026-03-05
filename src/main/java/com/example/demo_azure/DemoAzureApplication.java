package com.example.demo_azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoAzureApplication {

	@GetMapping("/message")
	public String message(){
		return "Your app deployed successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoAzureApplication.class, args);
	}

}
