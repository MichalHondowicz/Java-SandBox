package com.micHon.workshop.command;

public class CoffeMachineTurnOffCommand implements Command {

    CoffeMachine coffeMachine;

    public CoffeMachineTurnOffCommand(CoffeMachine coffeMachine) {
        this.coffeMachine = coffeMachine;
    }

    public void execute() {
        coffeMachine.turnOff();
    }
}
