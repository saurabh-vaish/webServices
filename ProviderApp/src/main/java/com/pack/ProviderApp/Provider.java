package com.pack.ProviderApp;

import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/otp")
public class Provider {

	
	@GET
	public String getOtp()
	{
		return UUID.randomUUID().toString().substring(0,4);
	}
}
