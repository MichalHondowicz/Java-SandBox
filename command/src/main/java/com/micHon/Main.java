package com.micHon;

import com.micHon.workshop.Robot;
import com.micHon.workshop.WorkshopApp;
import com.micHon.workshop.command.*;

public class Main {

    public static void main(String[] args) {

        CoffeMachine coffeMachine = new CoffeMachine();
        Robot robot = new Robot();

        WorkshopApp workshopApp = new WorkshopApp();
        workshopApp.addToQueue(new CoffeMachineTurnOnCommand(coffeMachine));
        workshopApp.addToQueue(new CoffeMachineTurnOffCommand(coffeMachine));
        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.addToQueue(new RobotCutCommand(robot));
        workshopApp.addToQueue(new RobotDrillCommand(robot));
        workshopApp.addToQueue(new RobotTurnOffCommand(robot));

        workshopApp.run();

    }
}
