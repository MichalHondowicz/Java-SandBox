package com.micHon.game;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private int score = 0;

    private Random random = new Random();

    private Scanner scanner = new Scanner(System.in);

    private final String QUESTION = "Guess the number from 0 to 9";

    private GuessGame() {

    }

    private static GuessGame instance = new GuessGame();

    public static GuessGame getInstance() {
        return instance;
    }

    public int getScore() {
        return score;
    }

    private int getRandomNumber() {
        return random.nextInt(9);
    }

    private int getUserNumber() {

        boolean correctInput = false;
        int answer = 0;

        while (!correctInput) {
            System.out.println(QUESTION);
            answer = scanner.nextInt();
            if (answer >= 0 && answer < 10) {
                correctInput = true;
            } else {
                System.out.println("Only number from 0 to 9");
            }
        }

        return answer;
    }

    public void play() {

        for (int i = 0; i < 10; i++) {
            int randomNumber = getRandomNumber();
            int userNumber = getUserNumber();
            if (randomNumber == userNumber) {
                System.out.println("Nice shot! :)");
                score++;
            } else {
                System.out.println("Almost, the answer was: " + randomNumber);
            }
        }
        System.out.println("Your score is: " + score);
    }
}
