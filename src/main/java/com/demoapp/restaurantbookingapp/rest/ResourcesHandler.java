package com.demoapp.restaurantbookingapp.rest;

import static io.muserver.openapi.InfoObjectBuilder.infoObject;
import static io.muserver.rest.CORSConfigBuilder.corsConfig;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

import io.muserver.openapi.OpenAPIObjectBuilder;
import io.muserver.rest.RestHandlerBuilder;

public class ResourcesHandler {

	public static RestHandlerBuilder createRestHandler() {
		return RestHandlerBuilder
				.restHandler(new RestaurantBookingResource())
				.addResource(new HealthResource())
				.addCustomWriter(new JacksonJaxbJsonProvider()).addCustomReader(new JacksonJaxbJsonProvider())
				.withCORS(corsConfig().withAllowedOriginRegex(".*")).withOpenApiHtmlUrl("/api.html")
				.withOpenApiJsonUrl("/openapi.json")
				.withOpenApiDocument(OpenAPIObjectBuilder.openAPIObject()
						.withInfo(infoObject().withTitle("Restaurant Booking API Documentation")
								.withDescription("This is just a demo API and getting static data!")
								.withVersion("1.0").build()));
	}

}
