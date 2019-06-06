package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/calc")
public class CalculateTax {

	@GET
	public String getNetSalary(@QueryParam("basic")double basic) {
		
		double hra=0.0,ta=0.0,da=0.0;
		double epf=0.0,profTax=0.0;
		double monIncm=0.0,tax=0.0;
		double netIncm=0.0,annualIncm=0.0,finalSal=0.0;
		
		hra = basic*12/100;
		ta= basic*8/100;
		da= basic*1/100;
		
		monIncm = basic + hra + ta + da; 
		
		epf= basic*8/100;
		profTax=200.0;
		
		netIncm = monIncm - (epf *2) - profTax;
		
		annualIncm = netIncm * 12;
		
		if(annualIncm <= 250000)
		{
			tax=0;
		}
		else if(annualIncm > 250000 && annualIncm <= 500000)
		{
			tax = annualIncm * 10/100;
		}
		else if(annualIncm > 500000 && annualIncm <= 1000000)
		{
			tax = annualIncm * 20/100;
		}
		else if(annualIncm > 1000000 )
		{
			tax = annualIncm * 30/100;
		}
		
		finalSal = annualIncm - tax;

		return "your final salary (per year) is =  "+ (annualIncm - tax);

		
		/* minimize code 
		double tax=0.0;
		
		double hra = basic*0.12;
		double ta= basic*0.08;
		double da= basic*0.01;
		
		double monIncm = basic + hra + ta + da; 
		
		double	epf= basic*0.08;
		double	profTax=200.0;
		double annualIncm =( monIncm - (epf *2) - profTax )*12;
		
		if(annualIncm <= 250000)
		{
			tax=0;
		}
		else if(annualIncm > 250000 && annualIncm <= 500000)
		{
			tax = annualIncm * 0.1;
		}
		else if(annualIncm > 500000 && annualIncm <= 1000000)
		{
			tax = annualIncm * 0.2;
		}
		else if(annualIncm > 1000000 )
		{
			tax = annualIncm * 0.3;
		}
		
		return "your final salary (per year) is =  "+ (annualIncm - tax);

		*/
	}
}



































