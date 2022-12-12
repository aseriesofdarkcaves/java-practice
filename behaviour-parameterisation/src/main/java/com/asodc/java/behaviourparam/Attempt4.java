package com.asodc.java.behaviourparam;

import java.util.ArrayList;
import java.util.List;

public class Attempt4 {
    public static void main(String[] args) {
        // Generate apple inventory
        List<Apple> inventory = AppleUtil.generateApples(10);

        // Print inventory
        AppleUtil.printAppleList("INVENTORY", inventory);

        // Print filtered inventory
        AppleUtil.printAppleList("GREEN APPLES", filterApples(inventory, new AppleGreenColourPredicate()));
        AppleUtil.printAppleList("RED APPLES", filterApples(inventory, new AppleRedColourPredicate()));
        AppleUtil.printAppleList("HEAVY APPLES", filterApples(inventory, new AppleHeavyWeightPredicate()));
        AppleUtil.printAppleList("RED AND HEAVY APPLES", filterApples(inventory, new AppleRedAndHeavyPredicate()));

        // Bonus parameterised colour predicate - don't really need this, but was interested to see what it would look like
        AppleUtil.printAppleList("BONUS PARAMETERISED PREDICATE - GREEN APPLES", filterApples(inventory, new AppleColourPredicate(Colour.GREEN)));
        AppleUtil.printAppleList("BONUS PARAMETERISED PREDICATE - RED APPLES", filterApples(inventory, new AppleColourPredicate(Colour.RED)));

        // Quiz 2.1 - Write a flexible prettyPrintApple method
        System.out.println("******************** Quiz 2.1 - Write a flexible prettyPrintApple method ********************");
        Attempt4.prettyPrintApple(inventory, new PrettyPrintWeightPredicate());
        Attempt4.prettyPrintApple(inventory, new PrettyPrintColourPredicate());
        Attempt4.prettyPrintApple(inventory, new PrettyPrintRelativeWeightPredicate());
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

    /**
     * Quiz 2.1 - Write a flexible prettyPrintApple method
     * Write a prettyPrintApple method that takes a List of Apples and that can be
     * parameterized with multiple ways to generate a String output from an apple
     * (a bit like multiple customized toString methods). For example, you could tell your
     * prettyPrintApple method to print only the weight of each apple. In addition, you
     * could tell your prettyPrintApple method to print each apple individually and mention
     * whether it’s heavy or light.
     *
     * @param inventory the apple inventory to be filtered
     */
    public static void prettyPrintApple(List<Apple> inventory, PrettyPrintPredicate predicate) {
        for (Apple apple : inventory) {
            String output = predicate.getPrettyString(apple);
            System.out.println(output);
        }
    }
}
