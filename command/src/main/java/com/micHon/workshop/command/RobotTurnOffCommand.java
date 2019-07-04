package com.micHon.workshop.command;

import com.micHon.workshop.Robot;

public class RobotTurnOffCommand implements Command {

    private Robot robot;

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.turnOff();
    }
}
