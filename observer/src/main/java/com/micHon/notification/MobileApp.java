package com.micHon.notification;

import com.micHon.order.Order;

public class MobileApp implements Observer {

    public void update(Order order) {
        System.out.println("App: Order: " + order.getOrderNumber() + "status has been changed to " + order.getOrderStatus());
    }
}
