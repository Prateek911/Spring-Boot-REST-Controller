package com.projects.one.demoAPI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.projects.one.demoAPI.common.EntryPointOne;
import com.projects.one.demoAPI.common.Pointer;

@Configuration
public class EntryConfig {
    
	@Bean
	public Pointer entryPointOne() {
		return new EntryPointOne();
		
	}
	
	
}
