package com.pack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		
		Subject sub = new Subject();
		sub.setCode("A");
		sub.setId(10);
		
		Subject sub1 = new Subject();
		sub1.setCode("B");
		sub1.setId(20);
		
		Student st = new Student();
		
		List<Subject> l = Arrays.asList(sub,sub1);
		
		
		Map<String,Double> map = new HashMap<String,Double>();
		map.put("math",80.5);
		map.put("computer",90.8);
		
		st.setSid(1);
		st.setSbs(l);
		st.setResult(map);
		
		try {
			
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(st);
			System.out.println(json);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
