package com.asodc.java.behaviourparam;

/**
 * One way to abstract the filtering logic is to model the selection criteria: you're working with apples and
 * returning a boolean based on some attributes of the apple. We call this a predicate - a function which returns
 * a boolean.
 * Subclasses which implement this interface can represent various types of selection criteria.
 * You can see these criteria as different behaviours for the filter method. What we just did is related to the
 * Strategy design pattern, which lets you define a family of algorithms, encapsulate each (strategy), and select an
 * algorithm at run-time.
 */
public interface ApplePredicate {
    boolean test(Apple apple);
}
