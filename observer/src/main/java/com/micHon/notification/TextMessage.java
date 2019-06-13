package com.micHon.notification;

import com.micHon.order.Order;

public class TextMessage {

    public void updateOrderStatus(Order order) {
        System.out.println("SMS: Order: " + order.getOrderNumber() + "status has been changed to " + order.getOrderStatus());
    }
}
