package com.micHon.workshop.command;

import com.micHon.workshop.Robot;

public class RobotDrillCommand implements Command {

    private Robot robot;

    public RobotDrillCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.drill();
    }
}
