package com.micHon;

import com.micHon.calculator.PriceCalculator;
import com.micHon.chef.Chef;
import com.micHon.discount_strategy.RegularPrice;
import com.micHon.discount_strategy.SalePrice;
import com.micHon.egg_cooker.HardBoiledEggCooker;
import com.micHon.egg_cooker.SoftBoiledEggCooker;

public class Main {

    public static void main(String[] args) {

        Chef chef = new Chef("Pascal");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();

        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, false);

        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, true);

        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, true);

        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, false);
    }
}
