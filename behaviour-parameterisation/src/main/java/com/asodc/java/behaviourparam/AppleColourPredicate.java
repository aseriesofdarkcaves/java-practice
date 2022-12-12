package com.asodc.java.behaviourparam;

public class AppleColourPredicate implements ApplePredicate {
    private final Colour colour;

    /**
     * Creates a colour predicate based on the given paramater.
     *
     * @param colour the colour for which to test
     */
    AppleColourPredicate(Colour colour) {
        this.colour = colour;
    }

    @Override
    public boolean test(Apple apple) {
        return colour.equals(apple.getColour());
    }
}
