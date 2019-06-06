package com.pack;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;

public class ProductClient {

	public static void main(String[] args) {
		
		String url = "http://localhost:8080/FormParamProvider/rest/product/info";
		
		Client c = Client.create();
		WebResource wr = c.resource(url);
		
		Form f = new Form();
		f.add("id", 101);
		f.add("code", "10-PQ");
		f.add("cost", 100.80);
		f.add("type", "computer");
		
		ClientResponse cr = wr.post(ClientResponse.class,f);
		
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		System.out.println(cr.getEntity(String.class));
		
		
	}

}
