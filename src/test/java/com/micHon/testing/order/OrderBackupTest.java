package com.micHon.testing.order;

import com.micHon.testing.Meal;
import com.micHon.testing.order.Order;
import com.micHon.testing.order.OrderBackup;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

class OrderBackupTest {

    private static OrderBackup orderBackup;

    @BeforeAll
    static void setUp() throws FileNotFoundException{
        orderBackup = new OrderBackup();
        orderBackup.createFile();
    }

    @Test
    void backupOrderWithOneMeal() throws IOException {

        Meal meal = new Meal(5, "Hot-Dog");
        Order order = new Order();
        order.addMealToOrder(meal);

        orderBackup.backupOrder(order);

        System.out.println("Order" + order.toString() + "backed up");
    }

    @AfterAll
    static void tearDown() throws IOException {
        orderBackup.closeFile();
    }


}