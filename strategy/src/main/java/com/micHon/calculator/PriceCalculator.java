package com.micHon.calculator;

import com.micHon.discount_strategy.PricingStrategy;

public class PriceCalculator {

    private PricingStrategy pricingStrategy;

    public void calculate(int price, boolean isSignedUpForNewsLetter){
        this.pricingStrategy.calculatePrice(price, isSignedUpForNewsLetter);
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}
