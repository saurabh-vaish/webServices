package com.app;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.app.model.Student;

public class JsonUtil {

	public static String getJsonData(Object ob)
	{
		String json=null;
		try {
		ObjectMapper om = new ObjectMapper();
		json = om.writeValueAsString(ob);
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return json;
	}
	
	
	public static Object getObjData(String json)
	{
		Object ob=null;
		try {
		ObjectMapper om = new ObjectMapper();
		ob = om.readValue(json,List.class);
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return ob;
	}
	
}
