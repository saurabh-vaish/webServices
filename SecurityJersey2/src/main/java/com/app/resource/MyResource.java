package com.app.resource;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/product")
public class MyResource {

	@GET
	@Path("/all")
	@PermitAll 					// no security required allow all
	public String showAll()
	{
		return "hello all";
	}
	
	
	@GET
	@Path("/none")
	@DenyAll 					// no one is allowed to access 
	public String showNone()
	{
		return "no one is allowed to use it";
	}
	
	
	@GET
	@Path("/admin")
	@RolesAllowed("ADMIN")		// user with role ADMIN are allowed 
	public String showAdmin()
	{
		return "hello from admin";
	}
	
	
	@GET
	@Path("/emp")
	@RolesAllowed("EMPLOYEE")		// user with role EMPLOYEE are allowed 
	public String showEmployee()
	{
		return "hello from employee";
	}
	
	
	@GET
	@Path("/both")
	@RolesAllowed({"ADMIN","EMPLOYEE"})		// user with role admin/employee both are allowed 
	public String showBoth()
	{
		return "hello for both admin/employee";
	}
}
