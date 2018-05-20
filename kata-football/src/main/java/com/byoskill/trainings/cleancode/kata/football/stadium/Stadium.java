package com.byoskill.trainings.cleancode.kata.football.stadium;

import java.time.LocalDate;
import java.util.List;

import com.byoskill.trainings.cleancode.kata.football.stadium.logic.SeatGenerator;

public class Stadium {
	private String city;
	private String name;
	private int availableSeats;
	private LocalDate openingDate;

	private List<Seat> seats;

	/**
	 * Instantiates a new stadium.
	 */
	public Stadium() {
		super();
	}

	public void generateSeats(SeatGenerator seatGenerator) {
		seats = seatGenerator.generate(this);
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public String getCity() {
		return city;
	}

	public String getName() {
		return name;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	@Override
	public String toString() {
		return "Stadium [city=" + city + ", name=" + name + ", availableSeats=" + availableSeats + ", openingDate="
				+ openingDate + "]";
	}

}
