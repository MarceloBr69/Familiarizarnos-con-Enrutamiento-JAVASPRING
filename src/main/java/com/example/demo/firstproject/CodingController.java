package com.example.demo.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/coding")
public class CodingController {
	
	public static void main(String[] args) {
		SpringApplication.run(CodingController.class, args);
	}
	@RequestMapping(" ")
	public String coding() {
		return "Hola Coding Dojo!";
	}
	@RequestMapping("/python")
	public String python() {
		return "¡Python/Django fue increíble!"; 
	}
	@RequestMapping("/java")
	public String java() {
		return "¡Java/Spring es mejor!";
	}
	

}
