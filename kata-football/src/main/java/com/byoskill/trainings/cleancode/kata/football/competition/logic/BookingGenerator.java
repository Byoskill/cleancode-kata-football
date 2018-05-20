package com.byoskill.trainings.cleancode.kata.football.competition.logic;

import java.util.List;

import com.byoskill.trainings.cleancode.kata.football.booking.Booking;
import com.byoskill.trainings.cleancode.kata.football.competition.Game;

public interface BookingGenerator {

    /**
     * Generate bookings.
     *
     * @param game
     *            the game
     * @return the list of bookings.
     */
    List<Booking> generateBookings(Game game);

}
