package com.micHon;

public interface State {
    
    void insertCoin(CoffeeMachine coffeeMachine);

    void pushTheButton(CoffeeMachine coffeeMachine);

    void takeTheCup(CoffeeMachine coffeeMachine);
}
