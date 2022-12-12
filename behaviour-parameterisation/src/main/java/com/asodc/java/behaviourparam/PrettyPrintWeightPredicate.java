package com.asodc.java.behaviourparam;

public class PrettyPrintWeightPredicate implements PrettyPrintPredicate {
    @Override
    public String getPrettyString(Apple apple) {
        return "This apple has a weight of " + apple.getWeight() + "g.";
    }
}
