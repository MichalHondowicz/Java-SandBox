package com.micHon;

import com.micHon.notification.EmailMessage;
import com.micHon.notification.MobileApp;
import com.micHon.notification.TextMessage;
import com.micHon.order.Order;
import com.micHon.order.OrderStatus;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(11L, OrderStatus.REGISTERED);

        TextMessage textMessage = new TextMessage();
        EmailMessage emailMessage = new EmailMessage();
        MobileApp mobileApp = new MobileApp();

        order.registerObserver(textMessage);
        order.registerObserver(emailMessage);
        order.registerObserver(mobileApp);

        order.notifyObservers();
        order.changeOrderStatus(OrderStatus.SENT);
        order.unregisterObserver(mobileApp);
        order.changeOrderStatus(OrderStatus.RECEIVED);
    }
}
