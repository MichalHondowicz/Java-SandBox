package com.micHon.testing.order;

import com.micHon.testing.Meal;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Meal> mealList = new ArrayList<>();

    public void addMealToOrder(Meal meal){
        this.mealList.add(meal);
    }

    public  void removeMeal(Meal meal){
        this.mealList.remove(meal);
    }

    public List<Meal> getMeals() {
        return mealList;
    }

    void cancel(){
        this.mealList.clear();
    }

    @Override
    public String toString() {
        return "Order{" +
                "mealList=" + mealList +
                '}';
    }
}
