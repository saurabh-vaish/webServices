package org.sathya.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.sathya.model.Employee;

@Path("/message")
public class MyResource {

	@GET
	@Produces("application/json")
	public Employee show()
	{
		return new Employee(10,"ABC",3.4);
	}
 
}
 