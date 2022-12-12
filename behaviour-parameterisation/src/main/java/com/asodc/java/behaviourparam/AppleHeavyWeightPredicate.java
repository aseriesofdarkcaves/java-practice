package com.asodc.java.behaviourparam;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() >= Apple.HEAVY_WEIGHT;
    }
}