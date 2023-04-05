package com.asodc.java.behaviourparam;

import java.util.ArrayList;
import java.util.List;

public class Attempt6 {
    public static void main(String[] args) {
        // Generate apple inventory
        List<Apple> inventory = AppleUtil.generateApples(10);

        // Print inventory
        AppleUtil.printAppleList("INVENTORY", inventory);

        // Print filtered inventory using lambda expression
        // Book suggests this syntax
//        List<Apple> redApples = filterApples(inventory, (Apple apple) -> Colour.RED.equals(apple.getColour()));
        // IDE auto-generated this syntax
        List<Apple> redApples = filterApples(inventory, apple -> Colour.RED.equals(apple.getColour()));
        AppleUtil.printAppleList("RED APPLES", redApples);
    }

    /**
     * The behaviour of the filterApples method depends on code you pass to it via the ApplePredicate object.
     * You've parameterised the behaviour of the filterApples method!
     * Behaviour parameterisation is great as it enables you to separate the logic of iterating over the collection to
     * filter and the behaviour to apply to each element of the collection. As a consequence, you can reuse the same
     * method and give it different behaviors to achieve different things.
     *
     * @param inventory the apple inventory to be filtered
     * @param predicate the predicate to apply to the filter logic
     * @return a list containing the filtered apple inventory
     */
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> filteredInventory = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                filteredInventory.add(apple);
            }
        }
        return filteredInventory;
    }
}
