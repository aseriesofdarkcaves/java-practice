package com.asodc.java.generics;

/**
 * Generic version of the Box class.
 *
 * @param <T> the type of the value being boxed
 */
// <T> here is known as a type parameter
public class Box<T> {
    // T stands for "Type"
    private T t;
    private Object object;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
