package com.mrb.firstapp;
 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {
	
	public static void main(String[] args) {
		
		SpringApplication.run(MyApp.class, args);
		// 1. Sets up the default configuration
		// 2. Starts the spring application context(containers)
		// 3. performs the class path scan
		// 4. Start Tomcat server		
		
		
		
	}
	
}
