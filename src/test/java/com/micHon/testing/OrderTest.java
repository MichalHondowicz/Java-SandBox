package com.micHon.testing;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class OrderTest {

    @Test
    void mealListShouldBeEmptyWhenOrderCreated() {

        Order order = new Order();

        assertThat(order.getMealList(), empty());
    }

    @Test
    void addMealToOrderShouldExtendOrder(){
        Meal meal = new Meal(10, "Kebab");
        Order order = new Order();

        order.addMealToOrder(meal);

        assertThat(order.getMealList(), Matchers.<Meal>hasSize(1));
        assertThat(order.getMealList(), contains(meal));
        assertThat(order.getMealList(), hasItem(meal));

    }

    @Test
    void removeMealFromOrderDecreaseOrderSize(){

        Meal meal = new Meal(10, "Kebab");
        Order order = new Order();

        order.addMealToOrder(meal);
        order.removeMeal(meal);

        assertThat(order.getMealList(), hasSize(0));
        assertThat(order.getMealList(), not(contains(meal)));
    }

    @Test
    void mealsToBeInCorrectOrder(){

        Meal meal = new Meal(10, "Kebab");
        Meal meal2 = new Meal(10, "Kebab");
        Order order = new Order();

        order.addMealToOrder(meal);
        order.addMealToOrder(meal2);

        assertThat(order.getMealList(), contains(meal,meal2));
        assertThat(order.getMealList(), containsInAnyOrder(meal2, meal));
    }


}