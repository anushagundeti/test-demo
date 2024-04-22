package com.in28minutes.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(
		exclude = {
				DataSourceAutoConfiguration.class,                      // REMOVE THIS
				DataSourceTransactionManagerAutoConfiguration.class,    // REMOVE THIS
		})
@RestController

public class AnushaProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(AnushaProject1Application.class, args);
	}


	@GetMapping("/hello")
	public String sayHello(@RequestParam(value = "myNLame", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}