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

import com.byoskill.trainings.cleancode.kata.football.competition.Game;
import com.byoskill.trainings.cleancode.kata.football.stadium.Seat;

public class Booking {
    private final Seat		seat;
    private final Game		game;
    private final BookingStatus	status = BookingStatus.AVAILABLE;

    /**
     * Instantiates a new booking.
     *
     * @param seat
     *            the seat
     * @param game
     *            the game
     */
    public Booking(final Seat seat, final Game game) {
	super();
	this.seat = seat;
	this.game = game;
    }

    public Game getGame() {
	return game;
    }

    public Seat getSeat() {
	return seat;
    }

    public BookingStatus getStatus() {
	return status;
    }

    @Override
    public String toString() {
	return "Booking [seat=" + seat + ", game=" + game + ", status=" + status + "]";
    }
}
