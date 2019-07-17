package com.micHon;

public class CoinInState implements State {


    public void insertCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Coin in");
    }

    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Making coffee");
        coffeeMachine.state = new CupFullState();
    }

    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Push the button");
    }
}
