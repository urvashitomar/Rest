package com.niit.rtt.myrest;

import javax.ws.rs.*;

@Path("employee")
public class EmployeeResource {
	
	@GET
	@Path("{empno}")
	@Produces("application/json")
	public String getJson(@PathParam("empno") int empno)
	{
		switch(empno)
		{
		case 1: return "{'name':'John Snow','age':28}";
		case 2: return "{'name':'Peter Norton','age':35}";
		default: return "{'name':'Jack of All','age':18}";
			
		}
	}
}
