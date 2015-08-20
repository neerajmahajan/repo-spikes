package com.rd.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestServerDaoTest {
	public static void main(String[] args) {

		String url = "http://localhost:8081/rest-server-dao/rest/user/uname/";
		String uname = "vishal";
		url = url + uname;
//		Client restClient = Client.create();
//		WebResource webResource = restClient.resource(url);
//		ClientResponse resp = webResource.accept("application/json").get(ClientResponse.class);
//		if(resp.getStatus() != 200){
//			System.err.println("Unable to connect to the server");
//		}
//		String output = resp.getEntity(String.class);
//		System.out.println("response: "+output);
		
	
		
		Client restClient = Client.create();
		WebResource webResource = restClient.resource(url);
		ClientResponse resp = webResource.accept("application/json").get(ClientResponse.class);
		if(resp.getStatus() != 200){
			System.err.println("Unable to connect to the server");
		}
		String output = resp.getEntity(String.class);
		System.out.println("response: "+output);
		
		
		
		
		
		
		
		
		/*
	ClientConfig clientConfig = new DefaultClientConfig();
	clientConfig.register(JacksonFeature.class);

	Client client = ClientBuilder.newClient(clientConfig);

	WebTarget webTarget = client
			.target("http://localhost:8888/demo-rest-jersey-spring/podcasts/2");

	Builder request = webTarget.request(MediaType.APPLICATION_JSON);

	Response response = request.get();
	Assert.assertTrue(response.getStatus() == 200);

	Podcast podcast = response.readEntity(Podcast.class);

	ObjectMapper mapper = new ObjectMapper();
	System.out
			.print("Received podcast from database *************************** "
					+ mapper.writerWithDefaultPrettyPrinter()
							.writeValueAsString(podcast));*/

	}
}
