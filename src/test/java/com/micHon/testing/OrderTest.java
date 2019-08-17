package com.micHon.testing;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@ExtendWith(BeforeAfterExtension.class)
class OrderTest {

    private Order order;

    @BeforeEach
    void initializeOrder(){
        order = new Order();
    }

    @AfterEach
    void cleanUp(){
        order.cancel();
    }

    @Test
    void mealListShouldBeEmptyWhenOrderCreated() {

        assertThat(order.getMeals(), empty());
    }

    @Test
    void addMealToOrderShouldExtendOrder(){
        Meal meal = new Meal(10, "Kebab");

        order.addMealToOrder(meal);

        assertThat(order.getMeals(), Matchers.<Meal>hasSize(1));
        assertThat(order.getMeals(), contains(meal));
        assertThat(order.getMeals(), hasItem(meal));

    }

    @Test
    void removeMealFromOrderDecreaseOrderSize(){

        Meal meal = new Meal(10, "Kebab");

        order.addMealToOrder(meal);
        order.removeMeal(meal);

        assertThat(order.getMeals(), hasSize(0));
        assertThat(order.getMeals(), not(contains(meal)));
    }

    @Test
    void mealsToBeInCorrectOrder(){

        Meal meal = new Meal(10, "Kebab");
        Meal meal2 = new Meal(10, "Kebab");

        order.addMealToOrder(meal);
        order.addMealToOrder(meal2);

        assertThat(order.getMeals(), contains(meal,meal2));
        assertThat(order.getMeals(), containsInAnyOrder(meal2, meal));
    }


}