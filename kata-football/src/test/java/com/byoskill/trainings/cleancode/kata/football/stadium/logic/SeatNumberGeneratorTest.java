package com.byoskill.trainings.cleancode.kata.football.stadium.logic;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import com.byoskill.trainings.cleancode.kata.football.stadium.SeatCategory;

public class SeatNumberGeneratorTest {

    private final SeatNumberGenerator seatNumberGenerator = new SeatNumberGenerator();

    @Test
    public void testNextSequence() throws Exception {
	Assertions.assertThat(seatNumberGenerator.nextSequence(SeatCategory.VIP)).isEqualTo("V0000001");
	Assertions.assertThat(seatNumberGenerator.nextSequence(SeatCategory.CATEGORY_1)).isEqualTo("A0000002");
	Assertions.assertThat(seatNumberGenerator.nextSequence(SeatCategory.CATEGORY_2)).isEqualTo("B0000003");
	Assertions.assertThat(seatNumberGenerator.nextSequence(SeatCategory.CATEGORY_3)).isEqualTo("C0000004");
	Assertions.assertThat(seatNumberGenerator.nextSequence(SeatCategory.CATEGORY_4)).isEqualTo("D0000005");
	Assertions.assertThat(seatNumberGenerator.nextSequence(SeatCategory.SKY_BOX)).isEqualTo("S0000006");
    }

}
