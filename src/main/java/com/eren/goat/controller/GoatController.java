package com.eren.goat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eren.goat.service.GoatService;

@RestController
public class GoatController {
	
	@Autowired
	GoatService goatService;
	
	@GetMapping(value = "/who-is-the-goat")
	public String hello() {
		return goatService.findOutTheGoat();
	}

}
