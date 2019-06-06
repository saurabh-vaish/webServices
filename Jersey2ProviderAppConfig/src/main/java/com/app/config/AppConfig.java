package com.app.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig{

	public AppConfig() {
		
		packages("com.app.resources");
	}
}
