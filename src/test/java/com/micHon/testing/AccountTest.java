package com.micHon.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class AccountTest {

    @Test
    void newAccountShouldBeNotActiveWhenCreated() {
        Account account = new Account();
        assertFalse(account.isActive());
        assertThat(account.isActive(), equalTo(false));
        assertThat(account.isActive(), is(false));
    }

    @Test
    void accountShouldBeActiveWhenActivated() {
        Account account = new Account();
        account.activate();
        assertTrue(account.isActive());
    }

    @Test
    void newlyCreatedAccountShouldNotHaveAddress() {
        Account account = new Account();
        Address address = account.getDeliveryAddress();
        assertNull(address);
        assertThat(address, nullValue());
    }

    @Test
    void deliveryAddressNotNullWhenSet() {
        Address address = new Address("Foksal", "12");
        Account account = new Account();
        account.setDeliveryAddress(address);

        Address address1 = account.getDeliveryAddress();
        assertNotNull(address1);
        assertThat(address1, notNullValue());


    }


}