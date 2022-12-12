package com.asodc.java.behaviourparam;

public class PrettyPrintColourPredicate implements PrettyPrintPredicate {
    @Override
    public String getPrettyString(Apple apple) {
        return "This apple is " + apple.getColour() + ".";
    }
}
