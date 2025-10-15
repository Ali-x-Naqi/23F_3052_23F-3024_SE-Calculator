package com.sqe.assignment;

/**
 * A simple calculator class that provides basic arithmetic operations.
 * This is the "System Under Test" (SUT).
 */
public class Calculator {

    /**
     * Adds two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The sum of a and b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second integer from the first.
     * @param a The first integer.
     * @param b The second integer.
     * @return The result of a - b.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     * @param a The first integer.
     * @param b The second integer.
     * @return The product of a and b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     * @param a The numerator.
     * @param b The denominator.
     * @return The result of a / b.
     * @throws IllegalArgumentException if the denominator (b) is zero.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}