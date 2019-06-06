package com.app;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/product")
public class ProductInfo {

	@POST
	@Path("/info")
	public String getInfo(@FormParam("id")int id,@FormParam("code")String code,@FormParam("cost")double cost,@FormParam("type")String type)
	{
		return ("your id = "+id+", your code = "+code+", cost = "+cost+" , type = "+type);
	}
}
