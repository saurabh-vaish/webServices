package com.app;

import java.util.StringTokenizer;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.commons.codec.binary.Base64;

import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.core.spi.factory.ResponseBuilderImpl;


@Path("/validate")
public class ProviderSecurityApp {

	@POST
	@Path("/user")
	public Response checkUser(@HeaderParam("Authorization")String auth)   // getting authorization key from header parameter
	{
		ResponseBuilder rb = new ResponseBuilderImpl();  // for getting response
		
		if(auth==null || "".equals(auth.trim()))   // checking auth. is null or empty 
		{
			rb.status(Status.BAD_REQUEST);
			rb.entity("NO Security Details Found");
		}
		else
		{
			// removing Basic<space> from value
			
			auth = auth.replace("Basic ","");
			
			
			// ------------------------- decoding encoded value-------------------------
			byte ar[] = auth.getBytes();
			byte dar[] = Base64.decodeBase64(ar);
			
			auth = new String(dar);
			
			// or reduced code
			//auth = new String(Base64.decodeBase64(auth.getBytes()));  
			
			// --------------------- ends ---------------------
			
			// ---------------- getting tokens from decoded string ------------------
			
			/* we can also use split method 
			String s[] = auth.split(":");
			String user = s[0];
			String pwd = s[1];
			*/
			StringTokenizer st = new StringTokenizer(auth,":");
			String user = st.nextToken();
			String pwd = st.nextToken();
			
			//-------------------ends tokenizing --------------------
			
			if(user.equals("admin") && pwd.equals("sathya"))   // validating user 
			{
				rb.status(Status.OK);
				rb.entity("Welcome User");
			}
			else
			{
				rb.status(Status.UNAUTHORIZED);        
				rb.entity("Invalid User Details");
			}
		}
		
		
		Response res = rb.build();        // getting response 
		return res;
	}
		
}
