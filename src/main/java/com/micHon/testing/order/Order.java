package com.micHon.testing.order;

import com.micHon.testing.Meal;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private OrderStatus orderStatus;
    private List<Meal> meals = new ArrayList<>();

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void addMealToOrder(Meal meal) {
        this.meals.add(meal);
    }

    public void removeMeal(Meal meal) {
        this.meals.remove(meal);
    }

    public List<Meal> getMeals() {
        return meals;
    }

    void cancel() {
        this.meals.clear();
    }

    public void changeOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "mealList=" + meals +
                '}';
    }
}
