package com.micHon.testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;

class OrderStatusTest {

    @ParameterizedTest
    @EnumSource(OrderStatus.class)
    void allOrderStatusToBeShorterThan15Chars(OrderStatus orderStatus){
        assertThat(orderStatus.toString().length(), lessThan(15));
    }
}

