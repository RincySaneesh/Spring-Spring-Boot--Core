package com.example.HomeController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class HomeControllerApplication {

	@RequestMapping("/")
	@ResponseBody
	public String greet() {
    return  "Welcome";
	}

	@RequestMapping("/about")
	public String about() {
		return  "ThankYou";
	}

	public static void main(String[] args) {

		SpringApplication.run(HomeControllerApplication.class, args);
	}

}
