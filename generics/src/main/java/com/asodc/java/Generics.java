package com.asodc.java;

public class Generics {
    public static void main(String... args) {
        // Box class
        // String type argument
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        String stringInBox = stringBox.get();

        // Integer type argument
        Box<Integer> integerBox = new Box<>();
        integerBox.set(1);
        Integer integerInBox = integerBox.get();

        // Pair interface
        Pair<String, Integer> p1 = new OrderedPair<>("Even", 8);
        Pair<String, String> p2 = new OrderedPair<>("hello", "world");

        // You can also substitute a type parameter with a parameterized type
        Pair<String, Box<Integer>> p3 = new OrderedPair<>("integerBox", integerBox);
        String key = p3.getKey();
        Box<Integer> value = p3.getValue();

        // Raw types
        // You'll probably see a warning about this in your IDE
        Box rawBox = new Box();

        // Generic methods
    }
}
