package com.nit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ser-api")
public class ServiceProvider
{
	@GetMapping("/info")
	public ResponseEntity<String >clientService()
	{
		return new ResponseEntity<String>("Customer Class Provider ",HttpStatus.OK);
	}

}
