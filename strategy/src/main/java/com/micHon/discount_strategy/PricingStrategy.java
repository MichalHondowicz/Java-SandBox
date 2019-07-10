package com.micHon.discount_strategy;

public interface PricingStrategy {

    void calculatePrice(int price, boolean isSignedUpForNewsLetter);
}
