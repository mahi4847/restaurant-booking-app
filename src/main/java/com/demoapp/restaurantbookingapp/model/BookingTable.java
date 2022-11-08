package com.demoapp.restaurantbookingapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingTable {
	// Auto generated column from DB
	private int bookingId;

	private String customerName;

	private String mobileNo;

	private String mailID;

	private AvailableTable availableTable;

}
