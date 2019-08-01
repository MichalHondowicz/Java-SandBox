package com.micHon.testing;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void simulateMassiveOrder(){
        Cart cart = new Cart();

        assertTimeout(Duration.ofMillis(10), cart::simulateMassiveOrder);
    }
}