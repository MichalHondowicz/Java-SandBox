package com.micHon.testing;

import com.micHon.testing.extensions.IAExceptionIgnoreExtension;
import com.micHon.testing.order.Order;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

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

    @Test
    void exceptionShouldBeThrownWhenDiscountBiggerThanPrice() {

        Meal meal = new Meal(8, "Soup");

        assertThrows(IllegalArgumentException.class, () -> meal.getDiscountPrice(40));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 15, 18})
    void mealPricesShouldBeLowerThan20(int price) {
        assertThat(price, lessThan(20));
    }

    @ExtendWith(IAExceptionIgnoreExtension.class)
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 9})
    void mealPricesShouldBeLowerThan10(int price) {

        if (price > 5) {
            throw new IllegalArgumentException();
        }
        assertThat(price, lessThan(10));
    }

    private static Stream<Arguments> createMealWithNameAndPrice() {
        return Stream.of(
                Arguments.of("Hamburger", 10),
                Arguments.of("Cheeseburger", 12)
        );
    }

    @ParameterizedTest
    @MethodSource("createMealWithNameAndPrice")
    void burgersShouldHaveCorrectNameAndPrice(String name, int price) {
        assertThat(name, containsString("burger"));
        assertThat(price, greaterThan(9));
    }

    private static Stream<String> createCakeNames() {
        List<String> cakeNames = Arrays.asList("Cheesecake", "Fruitcake");
        return cakeNames.stream();
    }

    @ParameterizedTest
    @MethodSource("createCakeNames")
    void cakeNameShouldEndWithCake(String name) {
        assertThat(name, notNullValue());
        assertThat(name, endsWith("cake"));
    }

    private int calculatePrice(int price, int quantity) {
        return price * quantity;
    }

    @TestFactory
    Collection<DynamicTest> calculateMealPrices() {
        Order order = new Order();
        order.addMealToOrder(new Meal(10, "Chicken", 3));
        order.addMealToOrder(new Meal(12, "Chips", 2));
        order.addMealToOrder(new Meal(14, "Fish", 1));

        Collection<DynamicTest> dynamicTests = new ArrayList<>();
        for (int i = 0; i < order.getMeals().size(); i++) {
            int price = order.getMeals().get(i).getPrice();
            int quantity = order.getMeals().get(i).getQuantity();

            Executable executable = () -> {
                assertThat(calculatePrice(price, quantity), lessThan(70));
            };
            String name = "Test name: " + i;
            DynamicTest dynamicTest = DynamicTest.dynamicTest(name, executable);
            dynamicTests.add(dynamicTest);
        }
        return dynamicTests;
    }
}