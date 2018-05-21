package com.byoskill.trainings.cleancode.kata.football.stadium.logic;

import com.byoskill.trainings.cleancode.kata.football.stadium.Seat;
import com.byoskill.trainings.cleancode.kata.football.stadium.SeatCategory;

public class StadiumSeatFactory {

    private final SeatNumberGenerator seatNumberGenerator;

    public StadiumSeatFactory(final SeatNumberGenerator seatNumberGenerator) {
	this.seatNumberGenerator = seatNumberGenerator;

    }

    public Seat newSeat(final SeatCategory category) {
	return new Seat(category, seatNumberGenerator.nextSequence(category));

    }

}
