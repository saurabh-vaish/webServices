package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

@Path("/user")
public class HeaderProvoider {

	@GET
	@Path("/msg")
	public String getMessage(@HeaderParam("eid")int eid,@HeaderParam("ename")String ename)
	{
		String msg = "employee eid is = "+eid+", employee name is ="+ename;
		
		if(eid==1001&&ename.equals("admin"))
		{
			return msg+"\n login successfull";
		}
		else
		{
		return msg+ " can't login";
		}
	}
}
