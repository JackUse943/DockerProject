package com.nit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pro-api")
public class ProductService 
{
	@RequestMapping("/info")
	public ResponseEntity<String >information()
	{
		
		return new ResponseEntity<String>("Product Information ",HttpStatus.OK);
	}

}
