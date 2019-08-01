package com.micHon.testing;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class CartTest {

    @Test
    void simulateMassiveOrder() {
        Cart cart = new Cart();

        assertTimeout(Duration.ofMillis(10), cart::simulateMassiveOrder);
    }

    @Test
    void cartShouldBeNotEmptyWhenOrderAdded() {

        Order order = new Order();
        Cart cart = new Cart();

        cart.addOrderToCart(order);

        assertThat(cart.getOrders(), allOf(
                notNullValue(),
                hasSize(1),
                is(not(empty())),
                is(not(emptyCollectionOf(Order.class)))
        ));

        assertAll(
                () -> assertThat(cart.getOrders(), notNullValue()),
                () -> assertThat(cart.getOrders(), hasSize(1)),
                () -> assertThat(cart.getOrders(), is(not(empty()))),
                () -> assertThat(cart.getOrders(), is(not(emptyCollectionOf(Order.class))))
        );
    }
}