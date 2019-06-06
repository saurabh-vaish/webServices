package com.pack;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		
		String json = "{\"empId\":100,\"empName\":\"Abc\",\"empSal\":100.50,\"empPw\":\"123\"}";
		
		String json2 = "{}";
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			Employee e = om.readValue(json2, Employee.class);
			System.out.println(e);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
		
		
		
	}

}
