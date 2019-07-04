package com.micHon.workshop;

import com.micHon.workshop.command.Command;

import java.util.ArrayList;
import java.util.List;

public class WorkshopApp {

    private List<Command> commandQueue = new ArrayList<Command>();

    public void addToQueue(Command command){
        commandQueue.add(command);
    }

    public void run(){

        if(commandQueue.isEmpty()){
            System.out.println("No commands found");
        }

        for (Command command: commandQueue){
            command.execute();
        }
        commandQueue.clear();
    }
}
