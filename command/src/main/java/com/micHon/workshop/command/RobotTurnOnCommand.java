package com.micHon.workshop.command;

import com.micHon.workshop.Robot;

public class RobotTurnOnCommand implements Command {

    private Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.turnOn();
    }

}

