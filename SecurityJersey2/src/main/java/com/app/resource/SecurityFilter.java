package com.app.resource;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.internal.util.Base64;


// this is class that is used for applying security 
public class SecurityFilter implements ContainerRequestFilter{

	//This code is used to read Provider class details at runtime based on URL entered by client
	@Context
	private ResourceInfo resource;

	//This object is used to read Request Headers return in List format even for one value
	@Context
	private HttpHeaders headers;

	// predefined method of ContainerRequestFilter
	@Override
	public void filter(ContainerRequestContext req) throws IOException {

		//Get method information of request method
		Method m =resource.getResourceMethod();

		/*
		 * System.out.println(m.getName()); //print method name which is accessed
		 * 
		 * //is method having annotation??
		 * System.out.println(m.isAnnotationPresent(PermitAll.class));
		 * System.out.println(m.isAnnotationPresent(DenyAll.class));
		 * System.out.println(m.isAnnotationPresent(RolesAllowed.class));
		 */

		//if method is having PermitAll then code required else not having annotation PermitAll then next level checking code required
		if(!m.isAnnotationPresent(PermitAll.class))
		{
			//if not this then check DenyAll
			if(m.isAnnotationPresent(DenyAll.class))
			{
				// if DenyAll present then no one is allowed then  stop here only.. no next step back to clien
				req.abortWith(Response.ok("You are not allowed to access !").status(Status.FORBIDDEN).build());
				return;
			}

			List<String> authList = headers.getRequestHeader("Authorization"); //Read Http Header
			
			// if no Auth Header exist (null or empty) reject with BAD-REQUEST (400)
			if(authList==null || authList.isEmpty())
			{
				req.abortWith(Response.ok("no user details found").status(Status.BAD_REQUEST).build()); 
				return; 
			}

			// read un,pwd from request header
			List<String> userDetails =getUserDetailsFromHttpHeader(authList.get(0));

			
			if(m.isAnnotationPresent(RolesAllowed.class))
			{
				//read method roles into List
				List<String> roles = Arrays.asList(m.getAnnotation(RolesAllowed.class).value());

				//verify is user valid or not?? if valid no checking required-continue else reject with Status-401
				if(!isUserDetailsValid(userDetails,roles))
				{
					req.abortWith(Response.ok("Invalid user details !").status(Status.UNAUTHORIZED).build());
					return;
				}
			}
		}
	}


	//check valid user name ,password and role entered by client given in request
	private boolean isUserDetailsValid(List<String> userDetails, List<String> roles) 
	{
		if(userDetails.get(0).equals("admin")&&userDetails.get(1).equals("sathya")&&roles.contains("ADMIN")) // for role ADMIN
		{
			return true;
		}

		if(userDetails.get(0).equals("admin")&&userDetails.get(1).equals("sathya")&&roles.contains("EMPLOYEE")) // for role EMPLOYEE
		{
			return true;
		}

		return false;
	}

	
	//Authorization Header is converted to List<String>  0-holds username and 1-holds password if exist
	List<String> getUserDetailsFromHttpHeader(String auth)
	{
		// remove Basic<space> then decode and get username and password
		String s[] = new String(Base64.decode(auth.replaceAll("Basic ", "").getBytes())).split(":");
		return Arrays.asList(s[0],s[1]);
	}

}
