package com.projects.one.demoAPI;

import org.springframework.web.bind.annotation.*;

@RestController
public class Restcontroller {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello!!";
	}
	
	@GetMapping("/entryPoint")
	public String entryPoint() {
		return "You are at entryPoint";
	}
	
	@GetMapping("/exitPoint")
	public String exitPoint() {
		return "You are at exitPoint";
	}


}
