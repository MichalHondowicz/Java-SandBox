package com.micHon;

import com.micHon.workshop.Robot;
import com.micHon.workshop.WorkshopApp;

public class Main {

    public static void main(String[] args) {

        WorkshopApp workshopApp = new WorkshopApp(new Robot());
        workshopApp.run();
    }
}
