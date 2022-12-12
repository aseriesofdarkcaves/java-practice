package com.asodc.java.behaviourparam;

public class PrettyPrintRelativeWeightPredicate implements PrettyPrintPredicate {
    @Override
    public String getPrettyString(Apple apple) {
        String weightClass;
        if (apple.getWeight() >= Apple.HEAVY_WEIGHT)
            weightClass = "HEAVY";
        else
            weightClass = "LIGHT";
        return "This apple is classed as " + weightClass + ".";
    }
}
