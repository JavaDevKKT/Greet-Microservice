package com.ktech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GreetApiAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetApiAppApplication.class, args);
	}

}
