package com.micHon.workshop.command;

import com.micHon.workshop.Robot;

public class RobotCutCommand implements Command {

    private Robot robot;

    public RobotCutCommand(Robot robot) {
        this.robot = robot;
    }

    public void execute() {
        robot.cut();
    }

    public void undo() {

    }
}
