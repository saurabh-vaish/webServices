package com.app.mediaType;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.app.model.Employee;

@Path("/userxml")
public class XmlProvider {

	@GET
	@Path("/xml")
	@Produces("application/xml")
	public Employee getXmlData()
	{
		Employee e = new Employee();
		e.setEmpId(1002);
		e.setEname("abc");
		e.setSal(2000);
		e.setOffer(25.60);
		
		return e;
	}
}
