package com.micHon.notification;

import com.micHon.order.Order;

public interface Observer {

    void update(Order order);
}
