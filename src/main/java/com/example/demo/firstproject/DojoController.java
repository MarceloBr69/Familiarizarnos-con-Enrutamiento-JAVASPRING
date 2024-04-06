package com.example.demo.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/coding")
public class DojoController {

	public static void main(String[] args) {
		SpringApplication.run(DojoController.class, args);
	}
	@RequestMapping("/{track}")
	public String dojo(@PathVariable("track") String track) {
		return "¡El "+track+ " es increíble!"; 
	}
	@RequestMapping("/burbank-dojo/{track}/{module}")
	public String burbank(@PathVariable("track") String track, @PathVariable("module") String module) {
		return "El "+ track + " " + module + " está localizado al sur de California";
	}

	@RequestMapping("/san-jose/{track}/{module}")
	public String sanJose(@PathVariable("track") String track, @PathVariable("module") String module) {
		return "El "+ track + " " + module + " es el cuartel general";
	}
}
