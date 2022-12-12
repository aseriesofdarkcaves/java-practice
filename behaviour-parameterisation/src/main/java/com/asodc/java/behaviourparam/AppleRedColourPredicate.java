package com.asodc.java.behaviourparam;

public class AppleRedColourPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
//        return new AppleColourPredicate(Colour.RED).test(apple);
        return Colour.RED.equals(apple.getColour());
    }
}
