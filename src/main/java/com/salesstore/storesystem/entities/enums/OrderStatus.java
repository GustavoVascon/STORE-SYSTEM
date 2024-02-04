package com.salesstore.storesystem.entities.enums;

// This enum represents different statuses an order can have
public enum OrderStatus {
	// Waiting for payment status with code 1
	WAITING_PAYMENT(1),
	// Paid status with code 2
	PAID(2),
	// Order has been shipped with code 3
	SHIPPED(3),
	// Order has been delivered with code 4
	DELIVERED(4),
	// Order has been canceled with code 5
	CANCELED(5);

	// Private field to hold the code associated with each status
	private int code;

	// Private constructor to set the code for each status
	private OrderStatus(int code) {
		this.code = code;
	}

	// Method to retrieve the code associated with a status
	public int getCode() {
		return code;
	}

	// Method to get the OrderStatus based on its code
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		// If the code doesn't match any status, throw an exception
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}