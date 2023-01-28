package com.example.Jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	
	
	@GetMapping("/hello")
		public String hello() {
			
			return "hello this is Jenkins demo";
			
		}
	}
	
	
	


