package com.kevin.spring.boot.demoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	//@GetMapping("/hello.api")
	@RequestMapping(value="/hello.api", method=RequestMethod.GET)
	public String HelloWorld() {
		return "Hello Rest API World~~~!!!";  
	}
}
