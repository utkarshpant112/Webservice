package com.WebServiceDemo.book;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/employee")
public class EmployeeCall {

	
	
	//	@GET
	//	@Produces(MediaType.TEXT_XML)
	//	@Path("{name}")
	//	public String sayHelloXML( @PathParam("name") String name)
	//	{
	//		
	//		String response="<?xml version='1.0'?>" +
	//						"<hello>Hello "+name+" </hello>" ;
	//		return response;
	//	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{name}")
	public String sayHelloJSON(@PathParam("name") String name)
	{
		
		 return "{'id':1001,'name':'Utkarsh','age':'21',email:'abc@gmail.com'}";
	}
	
	@POST
	@Path("/check")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response sendtoREST(InputStream incomingData)
	{
		StringBuilder builder = new StringBuilder();
		try {
				BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
				String line = null;
				while ((line = in.readLine()) != null) {
					builder.append(line);
				}
			} 
		catch (Exception e) {
			System.out.println("Error Parsing: - ");
			}
		System.out.println("Data Received: " + builder.toString());
	 
			// return HTTP response 200 in case of success
		return Response.status(200).entity(builder.toString()).build();
	}
}
