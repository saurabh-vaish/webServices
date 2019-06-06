package com.app.client;

import java.util.List;

import com.app.JsonUtil;
import com.app.model.Student;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientUtil {

	
	public static String saveEntity(String json)
	{
		String entity=null;
		final String url = "http://localhost:8080/CRUD-ReST-Provider/rest/student/save";
		try {
			Client c = Client.create();
			WebResource wr = c.resource(url);
			ClientResponse cr = wr.header("Content-Type", "application/json").post(ClientResponse.class,json);
			entity = cr.getEntity(String.class);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			entity="uanble to process";
		}
	
		return entity;
	}
	
	public static List<Student> getEntity()
	{
		List<Student> entity=null;
		final String url = "http://localhost:8080/CRUD-ReST-Provider/rest/student/get";
		try {
			Client c = Client.create();
			WebResource wr = c.resource(url);
			ClientResponse cr = wr.get(ClientResponse.class);
			String json = cr.getEntity(String.class);
			entity = (List<Student>) JsonUtil.getObjData(json);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
	
		return entity;
	}
	
	
	public static String deleteEntity(int sid)
	{
		String entity=null;
		final String url = "http://localhost:8080/CRUD-ReST-Provider/rest/student/delete?sid="+sid;
		try {
			Client c = Client.create();
			WebResource wr = c.resource(url);
			ClientResponse cr = wr.delete(ClientResponse.class);
			entity = cr.getEntity(String.class);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			entity="uanble to process";
		}
	
		return entity;
	}
	

	public static String updateEntity(String json)
	{
		String entity=null;
		final String url = "http://localhost:8080/CRUD-ReST-Provider/rest/student/update";
		try {
			Client c = Client.create();
			WebResource wr = c.resource(url);
			ClientResponse cr = wr.header("Content-Type", "application/json").put(ClientResponse.class,json);
			entity = cr.getEntity(String.class);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			entity="uanble to process";
		}
	
		return entity;
	}
	
	
}
