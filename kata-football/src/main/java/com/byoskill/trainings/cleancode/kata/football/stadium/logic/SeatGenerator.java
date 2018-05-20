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
package com.byoskill.trainings.cleancode.kata.football.stadium.logic;

import java.util.List;

import com.byoskill.trainings.cleancode.kata.football.stadium.Seat;
import com.byoskill.trainings.cleancode.kata.football.stadium.Stadium;

public interface SeatGenerator {

    /**
     * Generate the list of seats.
     *
     * @param stadium
     *            the stadium
     * @return the list of seats available in this stadium
     */
    List<Seat> generate(Stadium stadium);

}
