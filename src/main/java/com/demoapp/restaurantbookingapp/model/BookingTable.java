package com.demoapp.restaurantbookingapp.model;

public class BookingTable {
	//Auto generated column from DB
	private int bookingId;
	
	private String customerName;
	
	private int mobileNo;
	
	private String mailID;
	
	private AvailableTable availableTable;
	

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getMailID() {
		return mailID;
	}

	public void setMailID(String mailID) {
		this.mailID = mailID;
	}

	public AvailableTable getAvailableTable() {
		return availableTable;
	}

	public void setAvailableTable(AvailableTable availableTable) {
		this.availableTable = availableTable;
	}
}
