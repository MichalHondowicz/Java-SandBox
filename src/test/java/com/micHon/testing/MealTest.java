package com.micHon.testing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void shouldGetDiscountPrice() {

        Meal meal = new Meal(35);

        int discountPrice = meal.getDiscountPrice(7);

        assertEquals(28, discountPrice);
        assertThat(discountPrice, equalTo(28));
    }

    @Test
    void referencesToTheSameObjectShouldBeEqual() {
        Meal meal = new Meal(10);
        Meal meal1 = meal;

        assertSame(meal, meal1);
        assertThat(meal1, sameInstance(meal));
    }

    @Test
    void referencesToDifferentObjectShouldBeEqual() {
        Meal meal = new Meal(10);
        Meal meal1 = new Meal(20);

        assertNotSame(meal, meal1);
        assertThat(meal1, not(sameInstance(meal)));
    }

    @Test
    void twoMealsShouldBeEqualWhenPriceAndNAmeTheSame() {
        Meal meal1 = new Meal(20, "Burger");
        Meal meal2 = new Meal(20, "Burger");

        assertEquals(meal1, meal2);
    }
}