package com.projects.one.demoAPI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.projects.one.demoAPI.common.ExitPointOne;
import com.projects.one.demoAPI.common.Pointer;

@Configuration
public class ExitConfig {
    
	@Bean
	public Pointer exitPointOne() {
		return new ExitPointOne();
		
	}
	
	
}
