package com.asodc.java.behaviourparam;

import java.util.ArrayList;
import java.util.List;

/**
 * Second attempt: parameterising the colour.
 */
public class Attempt2 {
    public static void main(String... args) {
        // Generate some apples
        List<Apple> inventory = AppleUtil.generateApples(15);

        // Print the inventory
        AppleUtil.printAppleList("INVENTORY", inventory);

        // Print the filtered inventory
        AppleUtil.printAppleList("RED APPLES", filterApplesByColour(inventory, Colour.RED));
        AppleUtil.printAppleList("GREEN APPLES", filterApplesByColour(inventory, Colour.GREEN));
    }

    /**
     * How do we avoid duplicating most of the code in filterGreenApples to make filterRedApples?
     * To parameterise the colour and be more flexible to such changes, what you could do is add a parameter to your
     * method.
     *
     * @param inventory the apple inventory to be filtered
     * @param colour the colour for which apples should be filtered
     * @return a list containing the filtered apple inventory
     */
    public static List<Apple> filterApplesByColour(List<Apple> inventory, Colour colour) {
        List<Apple> filteredInventory = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColour().equals(colour)) {
                filteredInventory.add(apple);
            }
        }
        return filteredInventory;
    }
}
