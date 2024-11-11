package com.example.DemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
		ApplicationContext context=SpringApplication.run(Hello.class);
		Hello hello=context.getBean(Hello.class);
		hello.greet();
	}
}