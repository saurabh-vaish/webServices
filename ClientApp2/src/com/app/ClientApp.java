package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientApp {

	public static void main(String[] args) {
		
		String url ="http://localhost:8080/ProviderApp2/rest/msg/data";

		Client c = Client.create();
		
		WebResource wr = c.resource(url);
		
		wr = wr.queryParam("eid", "10");
		wr = wr.queryParam("ename", "Abc");
		wr = wr.queryParam("esal", "30.78");
		
		ClientResponse cr = wr.get(ClientResponse.class);
		
		
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
		System.out.println(cr.getEntity(String.class));
	}

}
