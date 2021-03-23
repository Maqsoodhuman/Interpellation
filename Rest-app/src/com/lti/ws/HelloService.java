package com.lti.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class HelloService {
	
	@GET
	
	//URL: http://localhost:8080/Rest-app/api/hello
	//public String sayHello(){
	//URL: http://localhost:8080/Rest-app/api/hello?name=Maqsodo
	//public String sayHello(@PathParam("name") String name){
	//URL: http://localhost:8080/Rest-app/api/hello/Majrul/18
	@Path("/{name}/{age}")
	public String sayHello(@PathParam("name") String name, @PathParam("age") int age) {
		return "Hello " + name + "from JAX-RS, you arge is " +age;
		
	}

}
