package com.asodc.java;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which Fibonacci number would you like to calculate? ");
        final int input = scanner.nextInt();

        System.out.printf("Calculated Fibonacci number(%d): %d" + System.lineSeparator(),
                input,
                fibonacciRecursive(input));
    }

    /**
     * Recursive algorithm to calculate the nth Fibonacci number given as an argument.
     * This algorithm quickly becomes very slow for not-very-large numbers!
     *
     * @param n the nth Fibonacci number to calculate
     * @return the value of the nth Fibonacci number
     */
    private static BigInteger fibonacciRecursive(int n) {
        if (n == 0 || n == 1)
            return BigInteger.valueOf(n);
        else
            return fibonacciRecursive(n - 1).add(fibonacciRecursive(n - 2));
    }
}
