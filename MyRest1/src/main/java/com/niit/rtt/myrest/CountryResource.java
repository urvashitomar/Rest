package com.niit.rtt.myrest;
 import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

 @Path("countries")
 public class CountryResource {
	
	CountryService cs=new CountryService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List getCountries()
	{
		List loc=cs.getAllCountries();
		return loc;
	}
	
	@GET
	@Path("/{id}")
	public Country getCountryById(@PathParam("id") int id)
	{
		return cs.getCountry(id);
	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Country addCountry(Country country)
	{
		return cs.addCountry(country);
	}
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Country updateCountry(Country country)
	{
		return cs.updateCountry(country);
	}
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteCountry(@PathParam("id") int id)
	{
		cs.deleteCountry(id);
	}
}
