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

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Competition represents the competition
 */
public class Competition {

    /** The games. */
    private List<Game> games = new ArrayList<>();

    /**
     * Gets the games.
     *
     * @return the games
     */
    public List<Game> getGames() {
	return games;
    }

    /**
     * Sets the games.
     *
     * @param games
     *            the new games
     */
    public void setGames(final List<Game> games) {
	this.games = games;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Competition [games=" + games + "]";
    }
}
