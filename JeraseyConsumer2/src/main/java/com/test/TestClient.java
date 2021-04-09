package com.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestClient {
	public static void main(String[] args) {

		String url = "http://localhost:3036/JerseyProducer2/rest/home/msg?eid=101&ename=A&esal=5.6";
//		String url = "http://localhost:3036/JerseyProducer2/rest/home/msg";
		Client c = Client.create();
		WebResource wr = c.resource(url);
		wr = wr.queryParam("ename", "ab");
		wr = wr.queryParam("esal", "2.3");
		wr = wr.queryParam("eid", "100");
		wr = wr.queryParam("edesg", "AA");
		ClientResponse cr = wr.get(ClientResponse.class);
		String s = cr.getEntity(String.class);
		System.out.println(s);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
	}
}
