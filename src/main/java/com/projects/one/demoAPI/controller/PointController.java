package com.projects.one.demoAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.one.demoAPI.common.Pointer;

@RestController
public class PointController {

	private Pointer point;
	
	@Value("${entry.one}")
	private String entryPointOne;
	
	@Value("${exit.one}")
	private String exitPointOne;
	
	
	@Autowired
	public PointController(@Qualifier("entryPointOne") Pointer myPoint) {
		System.out.println("In constructor: " +getClass().getSimpleName());
		point = myPoint;
	}
	
	
	
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome!!";
	
	}
	
	@GetMapping("/entryPointOne")
	public String getEntryPointer() {
		return point.getPointer();
	}
	
	@GetMapping("/exitPointOne")
	public String getExitPointer() {
		return point.getPointer();
	}

	
}
