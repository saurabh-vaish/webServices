package com.pack;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientApp {

	public static void main(String[] args) {
		
		String url = "http://localhost:9090/1ProviderAppMethods/rest/message";
		
		Client c = Client.create();
		
		WebResource wr = c.resource(url);
		
		ClientResponse cr = wr.get(ClientResponse.class);
		
		System.out.println(cr.getStatus() +" "+ cr.getStatusInfo());
		
		String str = cr.getEntity(String.class);
		System.out.println(str);
		
		System.out.println(wr.post(ClientResponse.class).getEntity(String.class));
		
		System.out.println(wr.put(ClientResponse.class).getEntity(String.class));
		
		System.out.println(wr.delete(ClientResponse.class).getEntity(String.class));
		

	}

}
