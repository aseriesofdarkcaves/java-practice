package com.asodc.java;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciMemoized {
    /**
     * Data structure to use to map already calculated Fibonacci numbers, so they can be looked-up instead of
     * being recalculated.
     * The key is the Fibonacci number, the value is the Fibonacci value for that Fibonacci number.
     */
    private static final Map<Integer, BigInteger> FIBONACCI_LOOKUP = new HashMap<>();

    public static void main(String[] args) {
        // loop so that the Map can build up values
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Which Fibonacci number would you like to calculate? ");
            final int input = scanner.nextInt();

            System.out.printf("Calculated Fibonacci number(%d): %d" + System.lineSeparator(),
                    input,
                    fibonacciMemoized(input)
            );
        }
    }

    /**
     * Memoized algorithm to calculate the nth Fibonacci number given as an argument.
     *
     * @param n the nth Fibonacci number to calculate
     * @return the value of the nth Fibonacci number
     */
    private static BigInteger fibonacciMemoized(int n) {
        if (n == 0 || n == 1)
            return BigInteger.valueOf(n);
        if (FIBONACCI_LOOKUP.containsKey(n))
            return FIBONACCI_LOOKUP.get(n);
        else {
            BigInteger result = fibonacciMemoized(n - 1).add(fibonacciMemoized(n - 2));
            FIBONACCI_LOOKUP.put(n, result);
            return result;
        }
    }
}
