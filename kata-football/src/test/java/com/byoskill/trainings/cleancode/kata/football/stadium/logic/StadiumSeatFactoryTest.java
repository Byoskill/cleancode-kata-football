package com.byoskill.trainings.cleancode.kata.football.stadium.logic;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.byoskill.trainings.cleancode.kata.football.stadium.Seat;
import com.byoskill.trainings.cleancode.kata.football.stadium.SeatCategory;

@RunWith(MockitoJUnitRunner.class)
public class StadiumSeatFactoryTest {
    @Mock
    private SeatNumberGenerator	seatNumberGenerator;
    @InjectMocks
    private StadiumSeatFactory	stadiumSeatFactory;

    @Test
    public void testNewSeat() throws Exception {
	final String expectedIdentifier = "A0000001";
	Mockito.when(seatNumberGenerator.nextSequence(SeatCategory.CATEGORY_1)).thenReturn(expectedIdentifier);
	final Seat seat = stadiumSeatFactory.newSeat(SeatCategory.CATEGORY_1);
	final Seat expectedSeat = new Seat(SeatCategory.CATEGORY_1, expectedIdentifier);
	Assertions.assertThat(seat).isEqualToComparingFieldByField(expectedSeat);

    }

}
