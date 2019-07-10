package com.micHon.discount_strategy;

public class SalePrice implements PricingStrategy {

    public void calculatePrice(int price, boolean isSignedUpForNewsLetter) {

        if (isSignedUpForNewsLetter) {
            int discountPrice = price / 2;
            System.out.println("The discount price is: " + discountPrice);
        } else {
            System.out.println("User not signed up, choose another strategy!");
        }
    }
}
