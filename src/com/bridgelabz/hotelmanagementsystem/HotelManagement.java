package com.bridgelabz.hotelmanagementsystem;

public class HotelManagement {
	private String nameForRegularCustomer;
	private double rateForRegularCustomer;
	
	public String getNameForRegularCustomer() {
		return nameForRegularCustomer;
	}
	public void setNameForRegularCustomer(String nameForRegularCustomer) {
		this.nameForRegularCustomer=nameForRegularCustomer;
	}
	public double getRateForRegularCustomer() {
		return rateForRegularCustomer;
	}
	public void setRateForRegularCustomer(double rateForRegularCustomer) {
		this.rateForRegularCustomer=rateForRegularCustomer;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Management System");
	}
}
