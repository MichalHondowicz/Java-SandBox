package com.micHon.notification;

import com.micHon.order.Order;

public class MobileApp {

    public void updateOrderStatus(Order order) {
        System.out.println("App: Order: " + order.getOrderNumber() + "status has been changed to " + order.getOrderStatus());
    }
}
