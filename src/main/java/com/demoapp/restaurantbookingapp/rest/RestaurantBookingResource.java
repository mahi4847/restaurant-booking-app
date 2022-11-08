package com.demoapp.restaurantbookingapp.rest;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.demoapp.restaurantbookingapp.model.AvailableTable;
import com.demoapp.restaurantbookingapp.model.BookingConfirmation;
import com.demoapp.restaurantbookingapp.model.BookingTable;
import com.demoapp.restaurantbookingapp.service.RestaurantBookingService;
import com.google.gson.Gson;

@Path("/restaurantbooking")
public class RestaurantBookingResource {

	RestaurantBookingService restaurantBookingService = new RestaurantBookingService();

	@GET
	@Path("/getallbookings/{date}")
	@Produces("application/json")
	public String getAllBookings(@PathParam("date") String date) {

		List<BookingTable> bookingTables = restaurantBookingService.getAllBookings(date);
		if (bookingTables == null && bookingTables.size() == 0) {
			throw new NotFoundException("No Bookings with date " + date);
		}
		Gson gson = new Gson();
		return gson.toJson(bookingTables);
	}

	@POST
	@Path("/booktable")
	@Produces("application/json")
	public String getBookTable(BookingTable bookingTable) throws IOException {
		// BookingTable bookingTable

//		Optional<InputStream> inputStreamOption = request.inputStream();
//        if (inputStreamOption.isPresent()) {
//            InputStream inputStream = inputStreamOption.get();
//            BookingTable bookingTable = inputStream.read
//            System.out.println(p.getProperty("name"));
//            // read the stream
//        }
		// return Response.status(201).build();
		BookingConfirmation bookingConfirmation = restaurantBookingService.bookingTable(bookingTable);
		if (bookingConfirmation == null) {
			throw new NotFoundException("Booking failed. please try again. ");
		}
		Gson gson = new Gson();
		return gson.toJson(bookingConfirmation);
	}

	@GET
	@Path("/getavailabletables")
	@Produces("application/json")
	public String getAvailableTables() {

		List<AvailableTable> availableTables = restaurantBookingService.getAvailableTables();
		if (availableTables == null || availableTables.size() == 0) {
			throw new NotFoundException("No available tables ");
		}
		Gson gson = new Gson();
		return gson.toJson(availableTables);
	}

	@PUT
	@Path("/addorUpdateAvailabletables")
	@Produces("application/json")
	public Boolean addorUpdateAvailableTables(AvailableTable availableTable) {

		Boolean isAddedOrUpdated = restaurantBookingService.addorUpdateAvailableTables(availableTable);
		return isAddedOrUpdated;
	}
}
