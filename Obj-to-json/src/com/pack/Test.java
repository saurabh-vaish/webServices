package com.pack;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.setEmpId(999);
		e.setEmpName("abc");
		e.setEmpSal(100.50);
		e.setEmpPw("1234");   // it will not come as it is @JsonIgnore
		
		ObjectMapper om = new ObjectMapper(); 
		
		try {
			String json = om.writeValueAsString(e);
			
			System.out.println(json);
	    	} 
			catch (IOException e1) {
				e1.printStackTrace();
		}
		
		
	}
	
}
