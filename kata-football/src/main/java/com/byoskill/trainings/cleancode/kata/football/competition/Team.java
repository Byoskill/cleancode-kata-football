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
package com.byoskill.trainings.cleancode.kata.football.competition;

public class Team {
    private final String country;

    /**
     * Instantiates a new team.
     *
     * @param country
     *            the country
     */
    public Team(final String country) {
	super();
	this.country = country;
    }

    public String getCountry() {
	return country;
    }

    @Override
    public String toString() {
	return "Team [country=" + country + "]";
    }

}
