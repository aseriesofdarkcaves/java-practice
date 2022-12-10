package com.asodc.java.behaviourparam;

import java.util.Random;

enum Colour {
    RED,
    GREEN;

    static Colour getRandom() {
        return values()[new Random().nextInt(values().length)];
    }
}
