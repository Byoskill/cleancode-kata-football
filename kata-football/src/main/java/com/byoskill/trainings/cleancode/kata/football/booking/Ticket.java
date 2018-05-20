/*
 * Copyright (C) 2017 Sylvain Leroy - BYOSkill Company All Rights Reserved
 * You may use, distribute and modify this code under the
 * terms of the MIT license, which unfortunately won't be
 * written for another century.
 *
 * You should have received a copy of the MIT license with
 * this file. If not, please write to: sleroy at byoskill.com, or visit : www.byoskill.com
 *
 */
package com.byoskill.trainings.cleancode.kata.football.booking;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
    private final Double	price;

    private final List<Booking>	bookings;
    private final LocalDate	acquisitionTime;

    /**
     * Instantiates a new ticket.
     *
     * @param price
     *            the price
     * @param bookings
     *            the bookings
     * @param acquisitionTime
     *            the acquisition time
     */
    public Ticket(final Double price, final List<Booking> bookings, final LocalDate acquisitionTime) {
	super();
	this.price = price;
	this.bookings = bookings;
	this.acquisitionTime = acquisitionTime;
    }

    public LocalDate getAcquisitionTime() {
	return acquisitionTime;
    }

    public List<Booking> getBookings() {
	return bookings;
    }

    public Double getPrice() {
	return price;
    }

    @Override
    public String toString() {
	return "Ticket [price=" + price + ", bookings=" + bookings + ", acquisitionTime=" + acquisitionTime + "]";
    }

}
