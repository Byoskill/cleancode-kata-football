package com.byoskill.trainings.cleancode.kata.football.stadium.logic;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.byoskill.trainings.cleancode.kata.football.stadium.Seat;
import com.byoskill.trainings.cleancode.kata.football.stadium.SeatCategory;
import com.byoskill.trainings.cleancode.kata.football.stadium.Stadium;

@RunWith(MockitoJUnitRunner.class)
public class SeatGeneratorImplTest {

    private final SeatGeneratorImpl seatGeneratorImpl = new SeatGeneratorImpl(
            new StadiumSeatFactory(new SeatNumberGenerator()));

    @Test
    public void testGenerate() throws Exception {
	final Stadium stadium = new Stadium();
	final int expected = 1000;
	stadium.setCapacity(expected);
	stadium.generateSeats(seatGeneratorImpl);
	final List<Seat> seats = stadium.getSeats();
	Assertions.assertThat(seats).hasSize(expected);
	Assertions.assertThat(seats)
	        .filteredOn(seat -> SeatCategory.VIP.equals(seat.getCategory()))
	        .hasSize(50);
	Assertions.assertThat(seats)
	        .filteredOn(seat -> SeatCategory.SKY_BOX.equals(seat.getCategory()))
	        .hasSize(200);
	Assertions.assertThat(seats)
	        .filteredOn(seat -> SeatCategory.CATEGORY_1.equals(seat.getCategory()))
	        .hasSize(100);
	Assertions.assertThat(seats)
	        .filteredOn(seat -> SeatCategory.CATEGORY_2.equals(seat.getCategory()))
	        .hasSize(100);
	Assertions.assertThat(seats)
	        .filteredOn(seat -> SeatCategory.CATEGORY_3.equals(seat.getCategory()))
	        .hasSize(150);
	Assertions.assertThat(seats)
	        .filteredOn(seat -> SeatCategory.CATEGORY_4.equals(seat.getCategory()))
	        .hasSize(400);
    }

    @Test
    public void testGenerateSeat() throws Exception {
	//
	final int expectedSize = 1000;
	final List<Seat> seatCollection = seatGeneratorImpl.generateSeat(expectedSize, SeatCategory.CATEGORY_1);
	Assertions.assertThat(seatCollection).hasSize(expectedSize);
	Assertions.assertThat(seatCollection)
	        .filteredOn(seat -> SeatCategory.CATEGORY_1.equals(seat.getCategory()))
	        .hasSize(1000);

    }

}
