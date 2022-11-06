package com.demoapp.restaurantbookingapp;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demoapp.restaurantbookingapp.controller.RestaurantBookingController;

import io.muserver.MuServer;
import io.muserver.MuServerBuilder;
import io.muserver.rest.RestHandlerBuilder;

@SpringBootApplication
public class RestaurantBookingAppApplication {

	public static void main(String[] args) {

		RestaurantBookingController controller = new RestaurantBookingController();
		MuServer server = MuServerBuilder.httpServer()
	            .addHandler(RestHandlerBuilder.restHandler(controller))
	            .start();

		System.out.println("API example: " + server.uri());

	}
}
