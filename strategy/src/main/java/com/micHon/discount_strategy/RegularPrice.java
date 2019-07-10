package com.micHon.discount_strategy;

public class RegularPrice implements PricingStrategy {

    public void calculatePrice(int price, boolean isSignedUpForNewsLetter) {

        if (isSignedUpForNewsLetter) {
            System.out.println("The regular price is: " + price);
        } else {
            System.out.println("User signed up, choose another strategy!");
        }
    }
}
