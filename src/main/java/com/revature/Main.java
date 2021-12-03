package com.revature;

import com.revature.service.RPS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RPS rps = new RPS();
        boolean isRunning = true;
        String response;

        System.out.println("Let's play rock, paper, scissors!");
        while(isRunning) {
            System.out.println();
            System.out.println("Player 1, please choose your hand:");
            options();
            int player1 = scanner.nextInt();
            System.out.println();

            System.out.println("Player 2, please choose your hand:");
            options();
            int player2 = scanner.nextInt();
            System.out.println();

            System.out.println("Rock, paper, scissors shoot!");
            System.out.println(rps.playerVsPlayer(player1, player2));
            System.out.println();

            System.out.println("Play again? (y/n)");
            response = scanner.next();

            if(response.equals("n") || response.equals("N"))
                isRunning = false;
        }
    }

    public static void options() {
        System.out.println("[1] rock");
        System.out.println("[2] paper");
        System.out.println("[3] scissors");
    }
}
