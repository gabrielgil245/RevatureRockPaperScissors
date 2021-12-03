package com.revature.service;

import junit.framework.TestCase;
import org.junit.Before;

public class RPSTest extends TestCase {

    RPS rps;

    @Before
    public void setUp() {
        rps = new RPS();
    }

    public void testPlayerVsPlayerWhenPlayerOneWins() {
        // Assign
        int player1 = 3;
        int player2 = 2;
        String expectedResult = "Player 1 wins!";

        // Act
        String actualResult = rps.playerVsPlayer(player1, player2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    public void testPlayerVsPlayerWhenPlayerTwoWins() {
        // Assign
        int player1 = 1;
        int player2 = 2;
        String expectedResult = "Player 2 wins!";

        // Act
        String actualResult = rps.playerVsPlayer(player1, player2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    public void testPlayerVsPlayerWhenPlayersAreTied() {
        // Assign
        int player1 = 2;
        int player2 = 2;
        String expectedResult = "Tie!";

        // Act
        String actualResult = rps.playerVsPlayer(player1, player2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    public void testPlayerVsPlayerWhenPlayersInputSomethingElse() {
        // Assign
        int player1 = 5;
        int player2 = 0;
        String expectedResult = "Invalid input(s). Please try again.";

        // Act
        String actualResult = rps.playerVsPlayer(player1, player2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}