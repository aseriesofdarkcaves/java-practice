package com.asodc.java.behaviourparam;

public class AppleGreenColourPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
//        return new AppleColourPredicate(Colour.GREEN).test(apple);
        return Colour.GREEN.equals(apple.getColour());
    }
}
