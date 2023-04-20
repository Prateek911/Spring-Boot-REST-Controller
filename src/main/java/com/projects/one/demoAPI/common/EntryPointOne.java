package com.projects.one.demoAPI.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class EntryPointOne implements Pointer {
	
	public EntryPointOne() {
		System.out.println("In constructor :" + getClass().getSimpleName());
		
	}
	
	@PostConstruct
	public void doStartup() {
		System.out.println("In start up");
	}
	
	@PreDestroy
	public void doClose() {
		System.out.println("In the end");
	}

	@Override
	public String getPointer() {
		// TODO Auto-generated method stub
		return "Entering through Entry Point One";
	}

}
