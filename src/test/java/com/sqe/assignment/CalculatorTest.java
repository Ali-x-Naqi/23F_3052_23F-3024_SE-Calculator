package com.sqe.assignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // =================================================================
    //  Tests by Wijdan Hyder (add and subtract)
    // =================================================================

    @Test
    @DisplayName("Add: Two positive numbers")
    void testAdd_whenBothInputsArePositive_shouldReturnCorrectSum() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Add: Two negative numbers")
    void testAdd_whenBothInputsAreNegative_shouldReturnCorrectSum() {
        assertEquals(-10, calculator.add(-7, -3));
    }

    @Test
    @DisplayName("Add: A positive and a negative number")
    void testAdd_whenOneInputIsPositiveAndOneIsNegative_shouldReturnCorrectSum() {
        assertEquals(5, calculator.add(10, -5));
    }

    @Test
    @DisplayName("Add: Adding zero to a number")
    void testAdd_whenOneInputIsZero_shouldReturnTheNumber() {
        assertEquals(10, calculator.add(10, 0));
    }

    @Test
    @DisplayName("Add: Adding to Integer.MAX_VALUE (Boundary Test)")
    void testAdd_whenAddingToMaxInteger_shouldOverflow() {
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MAX_VALUE, 1));
    }

    @Test
    @DisplayName("Subtract: A smaller number from a larger one")
    void testSubtract_whenSubtractingSmallerFromLarger_shouldReturnPositive() {
        assertEquals(8, calculator.subtract(10, 2));
    }

    @Test
    @DisplayName("Subtract: A number from itself")
    void testSubtract_whenSubtractingNumberFromItself_shouldReturnZero() {
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    @DisplayName("Subtract: A negative number from a positive number")
    void testSubtract_whenSubtractingNegativeFromPositive_shouldBeLikeAddition() {
        assertEquals(15, calculator.subtract(10, -5));
    }
}
