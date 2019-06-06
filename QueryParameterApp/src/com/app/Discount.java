package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/discount")
public class Discount {

	@GET
	public String calDis(@QueryParam("mrp")double mrp)
	{
		double dis;
		double finalCost;
		if(mrp<1000)
		{
			dis=0;
		}
		else if(mrp>=1000&&mrp<=5000)
		{
			dis=mrp*0.1;
		}
		else if(mrp>5000&&mrp<=15000)
		{
			dis=mrp*0.2;
		}
		else
		{
			dis=mrp*0.25;
		}
		
		
		finalCost = mrp - dis;
		
		if(dis>0) {
			return "your mrp = "+mrp+" and discount = "+dis+" and fianl cost = "+finalCost+" congrats";
		}
		else
		{
			return "sorry !! your mrp = "+mrp+" and discount = "+dis+" and fianl cost = "+finalCost;
		}
		
	}
	
}
