package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApp03Application {

	public static void main(String[] args) {
		
		System.out.println("Main Method is Started ");
		SpringApplication.run(DockerApp03Application.class, args);
		System.err.println("Spring Project Is Running Mode ");
		System.err.println("Main Method is Ended ");
	}

}
