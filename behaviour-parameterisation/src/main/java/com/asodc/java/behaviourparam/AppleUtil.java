package com.asodc.java.behaviourparam;

import java.util.ArrayList;
import java.util.List;

class AppleUtil {
    /**
     * Generate a list with a certain number of apples of a random colour.
     *
     * @param amount the amount of apples to generate
     * @return the list of generated apples
     */
    static List<Apple> generateApples(int amount) {
        List<Apple> apples = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            apples.add(Apple.newInstance());
        }
        return apples;
    }

    /**
     * Prints a list of apples.
     *
     * @param title  a title to give to the printed output
     * @param apples the list of apples to print
     */
    static void printAppleList(String title, List<Apple> apples) {
        System.out.println("******************** " + title + " ********************");
        for (Apple apple : apples) {
            System.out.println(apple);
        }
    }
}
