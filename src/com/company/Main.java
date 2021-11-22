package com.company;

import java.util.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int userInput = 0;
        boolean flag = true;
        System.out.println("Welcome to Tuwaiq 'guessing game'");
        Random rand = new Random();
        int randomNum;
        int numberOfTries = 0;
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("press '1' to play. \npress or 0 to exit");
            userInput = scanner.nextInt();
            if (userInput == 0) {
                flag = false;
            }
            if (userInput == 1) {
                System.out.println("Enter number of tries ");
                numberOfTries = scanner.nextInt();
                System.out.println("Note: you can press enter '-1' to rest the game ");
                System.out.println("Game started!");
                for (int i = 0; i < numberOfTries; i++) {
                    userInput = scanner.nextInt();
                    if (rand.nextInt(21) == userInput) {
                        score++;
                        System.out.println("You guessed correctly, current score: " + score);
                        if (score == 3) {
                            System.out.println("You won!");
                            score = 0;
                            break;
                        }
                    } else if (userInput == -1) {
                        score = 0;
                        System.out.println("Enter number of tries ");
                        numberOfTries = scanner.nextInt();
                        i = 0;
                        System.out.println("Game started!");
                    } else if (numberOfTries != i) {
                        System.out.println("Try again");
                    }

                }
                System.out.println("Game over");
            }

        }
    }
}
