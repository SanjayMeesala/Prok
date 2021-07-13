package com.prokarma;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class HelloProkarmaController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Prokarma";
	}

}
