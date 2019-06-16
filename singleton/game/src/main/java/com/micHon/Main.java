package com.micHon;
import com.micHon.game.GuessGame;

public class Main {

    public static void main(String[] args) {

        GuessGame game = GuessGame.getInstance();

        game.play();

        int score = game.getScore();

        GuessGame anotherGameReference = GuessGame.getInstance();

        if(game == anotherGameReference  ) {
            System.out.println("Singleton!");
            if(score == anotherGameReference.getScore()) {
                System.out.println("Score is OK!");
            }
        }
    }
}
