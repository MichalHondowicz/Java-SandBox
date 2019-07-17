package com.micHon;

public class CupFullState implements State {

    public void insertCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Take the cup");
    }

    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Take the cup first");
    }

    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Coffee taken");
        coffeeMachine.state = new NoCoinState();
    }
}
