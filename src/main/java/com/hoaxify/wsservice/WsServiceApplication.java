package com.hoaxify.wsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsServiceApplication.class, args);
	}

}
