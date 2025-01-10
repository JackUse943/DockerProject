package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerApp02Application {

	public static void main(String[] args) {
		SpringApplication.run(DockerApp02Application.class, args);
		System.out.println("Docker is Perfectly Running ");
	}

}
