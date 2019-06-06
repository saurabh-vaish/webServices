package com.pack;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/message")
public class Provider {

	@GET
	public String showGet()
	{
		return "get method";
	}
	
	@POST
	public String showPost()
	{
		return "post method";
	}
	
	@PUT
	public String showPut()
	{
		return "put method";
	}
	
	@DELETE
	public String showDelete()
	{
		return "delete method";
	}
	
}
