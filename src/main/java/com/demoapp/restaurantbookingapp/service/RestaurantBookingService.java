package com.demoapp.restaurantbookingapp.service;

import org.springframework.stereotype.Service;

import com.demoapp.restaurantbookingapp.model.AvailableTable;
import com.demoapp.restaurantbookingapp.model.BookingConfirmation;
import com.demoapp.restaurantbookingapp.model.BookingTable;

@Service
public class RestaurantBookingService {

	public BookingTable getAllBookings(String date) {
		// Get all the booking from DB based on date. user can enter data and time.
		// if user enter only date then get the data for entire date.
		
		return new BookingTable();
	}

	
	public AvailableTable getAvailableTables() {
		//get available table form DB
		return new AvailableTable();
	}


	public Boolean addorUpdateAvailableTables(AvailableTable availableTable) {
		// add new table 
		// update existing table if booking completed
		
		return true;
	}


	public BookingConfirmation bookingTable(BookingTable bookingTable) {
		// confirm the booking 
		// update AvailableTable with requested bookings
		return new BookingConfirmation();
	}

}
