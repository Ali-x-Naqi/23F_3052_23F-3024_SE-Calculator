package com.sqe.assignment;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Placeholder test class for the setup video.
 * Real tests will be added in Task 2.
 */
class CalculatorTest {

    @Test
    void testAdd_shouldReturnCorrectSum() {
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 10);
        assertEquals(15, sum, "5 + 10 should equal 15");
    }
}