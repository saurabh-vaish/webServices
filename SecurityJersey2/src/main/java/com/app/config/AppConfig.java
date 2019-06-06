package com.app.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.app.resource.SecurityFilter;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig {   // instead of web.xml 

	public AppConfig() {
		
		packages("com.app.resource");           //to search only in that package for resource instead of searching in all
		register(SecurityFilter.class); 		// register that class  before going to provider class it pass through that for security
		
	}
}
