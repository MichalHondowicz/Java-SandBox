package com.micHon.workshop.command;

public class CoffeMachineTurnOnCommand implements Command {

    CoffeMachine coffeMachine;

    public CoffeMachineTurnOnCommand(CoffeMachine coffeMachine) {
        this.coffeMachine = coffeMachine;
    }

    public void execute() {
        coffeMachine.turnOn();
    }
}
