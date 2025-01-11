package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApp04Application {

	public static void main(String[] args) {
		System.out.println("Main Method is Started ");
		SpringApplication.run(DockerApp04Application.class, args);
		System.out.println("Docker Implementation is Started ");
		System.out.println("Main Method is Started ");
	}

}
