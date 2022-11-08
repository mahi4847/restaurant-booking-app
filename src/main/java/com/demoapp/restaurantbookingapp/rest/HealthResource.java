package com.demoapp.restaurantbookingapp.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import io.muserver.rest.ApiResponse;
import io.muserver.rest.Description;

@Path("/health")
@Description(value = "Health check", details = "Health check")
public class HealthResource {

	@GET
	@Produces("application/json")
	@Description("Health check")
	@ApiResponse(code = "200", message = "Success")
	public String get() {
		return "Application is up and running";
	}

}
