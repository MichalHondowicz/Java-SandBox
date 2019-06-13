package com.micHon.notification;

import com.micHon.order.Order;

public class EmailMessage {

    public void updateOrderStatus(Order order) {
        System.out.println("E-mail: Order: " + order.getOrderNumber() + "status has been changed to " + order.getOrderStatus());
    }
}
