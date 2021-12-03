package com.revature.service;

public class RPS {
    public String playerVsPlayer(int player1, int player2) {
        // rock - 1, paper - 2, scissors - 3

        String results = null;

        if(player1 == player2)
            results = "Tie!";
        else {
            switch (player1) {
                case 1: // rock
                    switch (player2) {
                        case 2:
                            results = "Player 2 wins!";
                            break;
                        case 3:
                            results = "Player 1 wins!";
                            break;
                        default:
                            results = "Invalid input(s). Please try again.";
                            break;
                    }
                    break;
                case 2: // paper
                    switch (player2) {
                        case 1:
                            results = "Player 1 wins!";
                            break;
                        case 3:
                            results = "Player 2 wins!";
                            break;
                        default:
                            results = "Invalid input(s). Please try again.";
                            break;
                    }
                    break;
                case 3: // scissors
                    switch (player2) {
                        case 1:
                            results = "Player 2 wins!";
                            break;
                        case 2:
                            results = "Player 1 wins!";
                            break;
                        default:
                            results = "Invalid input(s). Please try again.";
                            break;
                    }
                    break;
                default:
                    results = "Invalid input(s). Please try again.";
                    break;
            }
        }

        return results;
    }
}
