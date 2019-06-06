package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class MatrixClient {

	public static void main(String[] args) {
		String url ="http://localhost:8080/MatrixParam/rest/msg/data;eid=10;ename=abv;esal=89.99";

		Client c = Client.create();
		
		WebResource wr = c.resource(url);
		
		
		
		ClientResponse cr = wr.get(ClientResponse.class);
		
		
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		System.out.println(cr.getEntity(String.class));
	}

}
