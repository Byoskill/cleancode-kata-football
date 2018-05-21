package com.byoskill.trainings.cleancode.kata.football.stadium.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.byoskill.trainings.cleancode.kata.football.stadium.Seat;
import com.byoskill.trainings.cleancode.kata.football.stadium.SeatCategory;
import com.byoskill.trainings.cleancode.kata.football.stadium.Stadium;

public class SeatGeneratorImpl implements SeatGenerator {

    private final StadiumSeatFactory stadiumSeatFactory;

    public SeatGeneratorImpl(final StadiumSeatFactory stadiumSeatFactory) {
	super();
	this.stadiumSeatFactory = stadiumSeatFactory;

    }

    @Override
    public List<Seat> generate(final Stadium stadium) {

	final int capacity = stadium.getCapacity();

	final List<Seat> seatList = new ArrayList<>();

	seatList.addAll(generateSeat(50, SeatCategory.VIP));
	seatList.addAll(generateSeat(200, SeatCategory.SKY_BOX));
	seatList.addAll(generateSeat(Math.round(0.10f * capacity), SeatCategory.CATEGORY_1));
	seatList.addAll(generateSeat(Math.round(0.10f * capacity), SeatCategory.CATEGORY_2));
	seatList.addAll(generateSeat(Math.round(.15f * capacity), SeatCategory.CATEGORY_3));
	seatList.addAll(generateSeat(capacity - seatList.size(), SeatCategory.CATEGORY_4));

	return seatList;
    }

    List<Seat> generateSeat(final int numberToGenerate, final SeatCategory category) {

	final List<Seat> generatedSeatList = new ArrayList<>();
	for (int i = 0; i < numberToGenerate; ++i) {
	    final Seat seat = stadiumSeatFactory.newSeat(category);
	    generatedSeatList.add(seat);
	}

	return generatedSeatList;
    }

}
