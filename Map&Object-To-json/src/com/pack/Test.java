package com.pack;

import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		
		Dept d = new Dept();
		d.setDid(44);
		d.setDname("D1");
		
		Dept d2 = new Dept();
		d2.setDid(45);
		d2.setDname("D2");
		
		Dept d3 = new Dept();
		d3.setDid(46);
		d3.setDname("D3");
		
		Admin ad = new Admin();
		ad.setAdminId(101);
		
		Map<String,Dept> map = new HashMap<String,Dept>();
		
		map.put("d1", d);
		map.put("d2", d2);
		map.put("d3", d3);
		
		ad.setObs(map);
		
		try {
			
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(ad);
			
			System.out.println(json);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
