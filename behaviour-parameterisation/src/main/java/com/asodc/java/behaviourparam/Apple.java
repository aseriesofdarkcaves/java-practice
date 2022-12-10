package com.asodc.java.behaviourparam;

import java.util.Random;

class Apple {
    private final Colour colour;
    private final int weight;

    public static final int MIN_WEIGHT = 1;
    public static final int MAX_WEIGHT = 300;
    public static final int HEAVY_WEIGHT = 150;

    /**
     * Creates an apple with a random colour and a weight in grams (g) between {@value MIN_WEIGHT} - {@value MAX_WEIGHT}.
     */
    Apple() {
        this(Colour.getRandom(), new Random().nextInt(MAX_WEIGHT) + MIN_WEIGHT);
    }

    /**
     * Creates an apple with a specific colour and weight.
     *
     * @param colour the colour of the apple
     * @param weight the weight of the apple
     */
    Apple(Colour colour, int weight) {
        this.colour = colour;
        this.weight = weight;
    }

    Colour getColour() {
        return colour;
    }

    int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.colour + " apple with a weight of " + this.weight + "g.";
    }
}
