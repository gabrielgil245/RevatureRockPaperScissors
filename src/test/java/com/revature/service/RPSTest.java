package com.revature.service;

import junit.framework.TestCase;
import org.junit.Before;

public class RPSTest extends TestCase {

    RPS rps;

    @Before
    public void setUp() {
        rps = new RPS();
    }

    public void testPlayerVsPlayer() {
        // Assign
        String player1 = "rock";
        String player2 = "scissors";
        String expectedResult = "Player 1 wins!";

        // Act
        String actualResult = rps.playerVsPlayer(player1, player2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}