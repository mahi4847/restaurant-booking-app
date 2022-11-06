package com.demoapp.restaurantbookingapp.model;

import java.util.Date;

public class AvailableTable {
	
	// Auto generated column from DB
	private int tableId;
	
	private int tableNo;
	
	private int tableSize;
	
	private Date availableDateTime;
	
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
	public int getTableSize() {
		return tableSize;
	}
	public void setTableSize(int tableSize) {
		this.tableSize = tableSize;
	}
	public Date getAvailableDateTime() {
		return availableDateTime;
	}
	public void setAvailableDateTime(Date availableDateTime) {
		this.availableDateTime = availableDateTime;
	}

}
