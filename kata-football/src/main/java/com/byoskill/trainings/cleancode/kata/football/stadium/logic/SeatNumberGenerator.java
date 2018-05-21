package com.byoskill.trainings.cleancode.kata.football.stadium.logic;

import org.apache.commons.lang3.Validate;

import com.byoskill.trainings.cleancode.kata.football.stadium.SeatCategory;

public class SeatNumberGenerator {
    private int allocatedSeats = 1;

    public String nextSequence(final SeatCategory category) {
	Validate.notNull(category, "Seat category is required");
	final StringBuilder sbBuilder = new StringBuilder();
	sbBuilder.append(category.getPrefix());
	sbBuilder.append(String.format("%07d", allocatedSeats++));
	return sbBuilder.toString();
    }

}
