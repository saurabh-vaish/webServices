package com.pack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.codehaus.jackson.map.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		
		Format fr = new Format();
		fr.setFid("101");
		fr.setCost(100.499);
		
		Format fr1 = new Format();
		fr1.setFid("102");
		fr1.setCost(10.99);
		
		
		Model md = new Model();
		List<String> l = Arrays.asList("red","blue");
		md.setColors(l);
		md.setType("Abc");
		md.setFob(fr);
		
		Model md1 = new Model();
		List<String> l1 = Arrays.asList("yellow","green");
		md1.setColors(l1);
		md1.setType("Xyz");
		md1.setFob(fr1);
		
		Product pd = new Product();
		pd.setPrdId(11);
		
		Set<Model> mobs = new HashSet<Model>();
		mobs.add(md);
		mobs.add(md1);
		
		pd.setMobs(mobs);
		
		
		try {
			
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(pd);
			
			System.out.println(json);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
