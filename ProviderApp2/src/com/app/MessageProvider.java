package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/msg")
public class MessageProvider {

	@GET
	@Path("/data")
	public String showMsg(@QueryParam("eid")int empId,@QueryParam("ename")String empName,@QueryParam("esal")double empSal)
	{
		String msg = "employee name :"+empName+" , employee id : "+empId+ " ,employee sal : "+empSal;
		return msg;
	}
	
}
