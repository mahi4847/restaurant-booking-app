package com.demoapp.restaurantbookingapp.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingConfirmation {

	private int id;
	private String customerName;
	private int tableNo;
	private Date bookingDate;
}
