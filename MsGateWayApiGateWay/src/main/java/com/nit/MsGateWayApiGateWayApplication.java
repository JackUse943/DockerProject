package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsGateWayApiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsGateWayApiGateWayApplication.class, args);
	}

}
