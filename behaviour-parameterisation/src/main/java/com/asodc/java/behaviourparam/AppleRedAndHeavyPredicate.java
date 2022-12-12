package com.asodc.java.behaviourparam;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return (new AppleRedColourPredicate().test(apple)) && (new AppleHeavyWeightPredicate().test(apple));
    }
}
