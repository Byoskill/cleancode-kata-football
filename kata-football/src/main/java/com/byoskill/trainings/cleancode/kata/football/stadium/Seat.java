package com.byoskill.trainings.cleancode.kata.football.stadium;

public class Seat {
	private SeatCategory category;
	private String seatNumber;

	public Seat(SeatCategory category, String seatNumber) {
		super();
		this.category = category;
		this.seatNumber = seatNumber;
	}

	public SeatCategory getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Seat [category=" + category + ", seatNumber=" + seatNumber + "]";
	}

	public void setCategory(SeatCategory category) {
		this.category = category;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

}
