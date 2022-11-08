package com.demoapp.restaurantbookingapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demoapp.restaurantbookingapp.rest.ResourcesHandler;

import io.muserver.MuServer;
import io.muserver.MuServerBuilder;

public class RestaurantBookingAppApplication {
	
	 private final static Logger logger = LoggerFactory.getLogger(RestaurantBookingAppApplication.class);

	public static void main(String[] args) {

		 MuServer server = MuServerBuilder.httpServer()
	                .addHandler(ResourcesHandler.createRestHandler())
	                .withHttpPort(10088)
	                .start();
	        logger.info("Started server at {}", server.uri());
	        logger.info("API HTML: {}" , server.uri().resolve("/api.html"));
	        logger.info("API JSON: {}" , server.uri().resolve("/openapi.json"));

	}
}
