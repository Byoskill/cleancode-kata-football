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
package com.byoskill.trainings.cleancode.kata.football.competition;

import java.time.LocalDate;
import java.util.List;

import com.byoskill.trainings.cleancode.kata.football.booking.Booking;
import com.byoskill.trainings.cleancode.kata.football.competition.logic.BookingGenerator;
import com.byoskill.trainings.cleancode.kata.football.stadium.Stadium;

public class Game {
    private LocalDate	  date;
    private GameOrder	  gameOrder;

    private Team	  team1;

    private Team	  team2;

    private Stadium	  stadium;

    private List<Booking> bookings;

    public Game() {
	super();
    }

    /**
     * Generate bookings.
     *
     * @param bookingGenerator
     *            the booking generator
     */
    public void generateBookings(final BookingGenerator bookingGenerator) {
	bookings = bookingGenerator.generateBookings(this);
    }

    public List<Booking> getBookings() {
	return bookings;
    }

    public LocalDate getDate() {
	return date;
    }

    public GameOrder getGameOrder() {
	return gameOrder;
    }

    public Stadium getStadium() {
	return stadium;
    }

    public Team getTeam1() {
	return team1;
    }

    public Team getTeam2() {
	return team2;
    }

    public void setDate(final LocalDate date) {
	this.date = date;
    }

    public void setGameOrder(final GameOrder gameOrder) {
	this.gameOrder = gameOrder;
    }

    public void setStadium(final Stadium stadium) {
	this.stadium = stadium;
    }

    public void setTeam1(final Team team1) {
	this.team1 = team1;
    }

    public void setTeam2(final Team team2) {
	this.team2 = team2;
    }

    @Override
    public String toString() {
	return "Game [date=" + date + ", gameOrder=" + gameOrder + ", team1=" + team1 + ", team2=" + team2
	        + ", stadium=" + stadium + "]";
    }
}