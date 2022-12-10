package com.asodc.java.behaviourparam;

import java.util.ArrayList;
import java.util.List;

/**
 * First attempt: filtering green apples.
 */
public class Attempt1 {
    public static void main(String... args) {
        // Generate some apples
        List<Apple> inventory = AppleUtil.generateApples(10);

        // Print the inventory
        AppleUtil.printAppleList("INVENTORY", inventory);

        // Print the filtered inventory
        AppleUtil.printAppleList("FILTERED INVENTORY", filterGreenApples(inventory));
    }

    /**
     * Note the condition required to select green apples. You can assume that you have a Colour enum with a set of
     * colours available. But now the farmer changes his mind and also wants to filter red apples. What can you do?
     * A naieve solution would be to duplicate your method, rename it filterRedApples and change the if condition to
     * match red apples. However, this approach doesn't cope well with changes if the farmer wants multiple colours.
     * A good principle is this: when you find yourself writing nearly repeated code, try to abstract instead.
     *
     * @param inventory the apple inventory to be filtered
     * @return a List containing the filtered apple inventory
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> filteredInventory = new ArrayList<>();
        for (Apple apple : inventory) {
            if (Colour.GREEN.equals(apple.getColour())) {
                filteredInventory.add(apple);
            }
        }
        return filteredInventory;
    }
}
