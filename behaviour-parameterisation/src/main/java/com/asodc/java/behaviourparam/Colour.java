package com.asodc.java.behaviourparam;

import java.util.Random;

enum Colour {
    RED,
    GREEN;

    private static final Random RANDOM = new Random();

    static Colour getRandom() {
        return values()[RANDOM.nextInt(values().length)];
    }
}
