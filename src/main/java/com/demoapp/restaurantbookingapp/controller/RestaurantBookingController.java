package com.demoapp.restaurantbookingapp.controller;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.demoapp.restaurantbookingapp.model.AvailableTable;
import com.demoapp.restaurantbookingapp.model.BookingConfirmation;
import com.demoapp.restaurantbookingapp.model.BookingTable;
import com.demoapp.restaurantbookingapp.service.RestaurantBookingService;

@Path("/restaurantbooking")
public class RestaurantBookingController {
	
	//@Autowired
	RestaurantBookingService restaurantBookingService = new RestaurantBookingService();
	
	@GET
    @Path("/getallbookings/{date}")
    @Produces("application/json")
    public BookingTable getAllBookings(@PathParam("date") String date) {
		
		BookingTable bookingTable = restaurantBookingService.getAllBookings(date);
        if (bookingTable == null) {
            throw new NotFoundException("No Bookings with date " + date);
        }
        return bookingTable;
    }
	
	@POST
    @Path("/booktable")
    @Produces("application/json")
    public BookingConfirmation getBookTable(BookingTable bookingTable) {
		
		BookingConfirmation bookingConfirmation = restaurantBookingService.bookingTable(bookingTable);
        if (bookingConfirmation == null) {
            throw new NotFoundException("Booking failed. please try again. ");
        }
        return bookingConfirmation;
    }
	
	@GET
    @Path("/getavailabletables")
    @Produces("application/json")
    public AvailableTable getAvailableTables() {
		
		AvailableTable availableTable = restaurantBookingService.getAvailableTables();
        if (availableTable == null) {
            throw new NotFoundException("No available tables ");
        }
        return availableTable;
    }
	
	@PUT
    @Path("/addorUpdateAvailabletables")
    @Produces("application/json")
    public Boolean addorUpdateAvailableTables(AvailableTable availableTable) {
		
		Boolean isAddedOrUpdated = restaurantBookingService.addorUpdateAvailableTables(availableTable);
        return isAddedOrUpdated;
	}
}
