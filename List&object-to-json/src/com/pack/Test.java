package com.pack;

import java.util.Arrays;
import java.util.List;

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
		
		List<Dept> l = Arrays.asList(d,d2,d3);
		
		ad.setObs(l);
		
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
