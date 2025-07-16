package com.ktech.rest;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class GreetRestController {
	
    @GetMapping("/greet")
	public String greetMessage() {
		return "Greet Microservice... .......";
	}
}