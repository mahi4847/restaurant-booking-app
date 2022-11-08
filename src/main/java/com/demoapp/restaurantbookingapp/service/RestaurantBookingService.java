package com.demoapp.restaurantbookingapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.demoapp.restaurantbookingapp.model.AvailableTable;
import com.demoapp.restaurantbookingapp.model.BookingConfirmation;
import com.demoapp.restaurantbookingapp.model.BookingTable;

public class RestaurantBookingService {

	public List<BookingTable> getAllBookings(String date) {
		// Get all the booking from DB based on date. user can enter data and time.
		// if user enter only date then get the data for entire date.
		AvailableTable at = new AvailableTable(1, 2, 10, new Date());
		BookingTable bt1 = new BookingTable(1, "TestName1", "654987321", "test1@gmail.com", at);
		List<BookingTable> bts = new ArrayList<>();
		bts.add(bt1);

		return bts;
	}

	public List<AvailableTable> getAvailableTables() {
		// get available table form DB
		AvailableTable at = new AvailableTable(1, 2, 10, new Date());
		List<AvailableTable> ats = new ArrayList<>();
		ats.add(at);

		return ats;
	}

	public Boolean addorUpdateAvailableTables(AvailableTable availableTable) {
		// add new table
		// update existing table if booking completed

		return true;
	}

	public BookingConfirmation bookingTable(BookingTable bookingTable) {
		// confirm the booking
		// update AvailableTable with requested bookings
		BookingConfirmation bc = new BookingConfirmation(1, "testname", 2, new Date());
		return bc;
	}

}
