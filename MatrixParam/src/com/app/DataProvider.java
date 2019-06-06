package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;


@Path("/msg")
public class DataProvider {

	
	@GET
	@Path("/data")
	public String showMsg(@MatrixParam("eid")int empId,@MatrixParam("ename")String empName,@MatrixParam("esal")double empSal)
	{
		String msg = "employee name :"+empName+" , employee id : "+empId+ " ,employee sal : "+empSal;
		return msg;
	}
	
}

