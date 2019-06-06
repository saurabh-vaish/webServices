package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class HeaderClient {

	public static void main(String[] args) {
		
		String url="http://localhost:8080/HeaderParamProvider/rest/user/msg";
		
		Client c = Client.create();
		WebResource wr = c.resource(url);
		// passing header parameters 
		ClientResponse cr = wr.header("eid",1001).header("ename", "admin").get(ClientResponse.class);
		
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		System.out.println(cr.getEntity(String.class));
	}

}
