package com.supriya.jenkinsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsIntegrationApplication {

	@GetMapping(value = "/jenkins")
	public String message(){
		return "Welcome to Spring Boot Jenkins Demo!";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinsIntegrationApplication.class, args);
	}

}
