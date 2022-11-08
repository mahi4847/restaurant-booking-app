package com.demoapp.restaurantbookingapp.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AvailableTable {

	// Auto generated column from DB
	private int tableId;

	private int tableNo;

	private int tableSize;

	private Date availableDateTime;

}
