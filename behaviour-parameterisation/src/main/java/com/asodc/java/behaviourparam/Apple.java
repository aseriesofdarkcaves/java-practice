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
    private Apple() {
        this(Colour.getRandom(), new Random().nextInt(MAX_WEIGHT) + MIN_WEIGHT);
    }

    /**
     * Creates an apple with a specific colour and weight.
     *
     * @param colour the colour of the apple
     * @param weight the weight of the apple
     */
    private Apple(Colour colour, int weight) {
        this.colour = colour;
        this.weight = weight;
    }

    /**
     * Static factory method to return valid apple instances.
     *
     * @return a valid apple
     */
    static Apple newInstance() {
        return new Apple();
    }

    /**
     *
     * @return the colour of the apple
     */
    Colour getColour() {
        return colour;
    }

    /**
     *
     * @return the weight of the apple
     */
    int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.colour + " apple with a weight of " + this.weight + "g.";
    }
}
