package com.micHon;

public class NoCoinState implements State {

    public void insertCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Coin in");
        coffeeMachine.state = new CoinInState();
    }

    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Insert coin");
    }

    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Insert coin");
    }
}
