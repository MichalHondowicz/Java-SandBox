package com.micHon;

public class CoffeeMachine {

    State state;

    public CoffeeMachine() {
        state = new NoCoinState();
    }


    public void insertCoin() {
        state.insertCoin(this);
    }

    public void pushTheButton() {
        state.pushTheButton(this);
           }

    public void takeTheCup() {
        state.takeTheCup(this);
    }

}
