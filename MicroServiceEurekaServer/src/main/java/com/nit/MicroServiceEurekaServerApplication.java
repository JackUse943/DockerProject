package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServiceEurekaServerApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(MicroServiceEurekaServerApplication.class, args);
	     System.out.println("Server Is running on the  port Number 8761");
	}

}
