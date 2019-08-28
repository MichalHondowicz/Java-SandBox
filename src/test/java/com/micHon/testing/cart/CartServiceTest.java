package com.micHon.testing.cart;

import com.micHon.testing.order.Order;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CartServiceTest {

    @Test
    void processCartShouldSendToPrepare(){

        Order order = new Order();
        Cart cart = new Cart();
        cart.addOrderToCart(order);

        CartHandler cartHandler = mock(CartHandler.class);
        CartService cartService = new CartService(cartHandler);
        given(cartHandler.canHandleCart(cart)).willReturn(true);

        Cart resultCart = cartService.processCart(cart);

        verify(cartHandler).sendToPrepare(cart);
        assertThat(resultCart.getOrders(), hasSize(1));
    }
}
