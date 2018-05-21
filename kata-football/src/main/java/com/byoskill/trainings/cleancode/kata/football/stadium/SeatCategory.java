package com.byoskill.trainings.cleancode.kata.football.stadium;

public enum SeatCategory {
    CATEGORY_1('A'), CATEGORY_2('B'), CATEGORY_3('C'), CATEGORY_4('D'), SKY_BOX('S'), VIP('V');

    ;
    private final char prefix;

    private SeatCategory(final char prefix) {
	this.prefix = prefix;
    }

    public char getPrefix() {
	return prefix;
    }
}
