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

        // Filtering by colour
        AppleUtil.printAppleList("RED APPLES", filterApplesByColour(inventory, Colour.RED));
        AppleUtil.printAppleList("GREEN APPLES", filterApplesByColour(inventory, Colour.GREEN));

        // Filtering by weight
        AppleUtil.printAppleList("HEAVY APPLES", filterApplesByWeight(inventory, Apple.HEAVY_WEIGHT));
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

    /**
     * The farmer comes back to you and says "it would be really cool to differentiate between light and heavy apples".
     * Heavy apples are defined as apples that have a weight greater than 150g.
     * Wearing your software engineering hat, you realise in advance that the farmer may want to vary the weight.
     * So you create a method to cope with various weights via an additional parameter.
     * This is a good solution, but notice how you have to duplicate most of the implementation for traversing inventory
     * and applying the filtering criteria on each apple.
     * This is somewhat disappointing because it breaks the DRY principle.
     * What if you want to alter the filter traversing to enhance performance? You now have to modify the implementation
     * of all your methods instead of only a single one.
     *
     * @param inventory the apple inventory to be filtered
     * @param weight the weight for which apples should be filtered
     * @return a list containing the filtered apple inventory
     */
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> filteredInventory = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                filteredInventory.add(apple);
            }
        }
        return filteredInventory;
    }
}
