package com.asodc.java.behaviourparam;

import java.util.ArrayList;
import java.util.List;

public class Attempt3 {
    public static void main(String[] args) {
        // Generate some apples
        List<Apple> inventory = AppleUtil.generateApples(10);

        // Print the inventory
        AppleUtil.printAppleList("INVENTORY", inventory);

        // You can tell this is terrible once you have to use it
        AppleUtil.printAppleList("SOMETHING", filterApples(inventory, Colour.GREEN, 0, true));
        AppleUtil.printAppleList("SOMETHING", filterApples(inventory, null, 150, false));
    }

    /**
     * An ugly attempt to merge all attributes. This solution is extremely bad. The client code is terrible.
     * What do true and false mean? In addition, this solution doesn't cope well with changing requirements.
     * What if the farmer asks you to filter with different attributes of an apple, for example, its size, shape
     * origin, and so on? What if the farmer asks you for more complicated queries that combine attributes, such as
     * green apples that are also heavy?
     * You'd either have multiple duplicated filter methods or one hugely complex method. So far, you've parameterised
     * the filterApples method with values such as a String, an int, an enum or a boolean. This can be fine for certain
     * well-defined problems. In this case however, what you need is a better way to tell your filterApples method the
     * selection criteria for apples. Behaviour parameterisation can be used to attain flexibility.
     *
     * @param inventory the apple inventory to be filtered
     * @param colour    the colour for which apples should be filtered
     * @param weight    the weight for which apples should be filtered
     * @param flag      a magic undocumented boolean with a terrible variable name which doesn't explain what it is
     * @return a list containing the filtered apple inventory
     */
    public static List<Apple> filterApples(List<Apple> inventory, Colour colour, int weight, boolean flag) {
        List<Apple> filteredInventory = new ArrayList<>();
        for (Apple apple : inventory) {
            // Never do this
            if ((flag && apple.getColour().equals(colour)) || (!flag && apple.getWeight() > weight)) {
                filteredInventory.add(apple);
            }
        }
        return filteredInventory;
    }
}
