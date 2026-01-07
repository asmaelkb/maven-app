
package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void add_shouldReturnSum() {
        assertEquals(7, calc.add(3, 4));
        assertEquals(-1, calc.add(-3, 2));
    }

    @Test
    void subtract_shouldReturnDifference() {
        assertEquals(1, calc.subtract(5, 4));
        assertEquals(-5, calc.subtract(-3, 2));
    }

    @Test
    void multiply_shouldReturnProduct() {
        assertEquals(12, calc.multiply(3, 4));
        assertEquals(0, calc.multiply(100, 0));
    }

    @Test
    void divide_shouldReturnQuotient() {
        assertEquals(2.5, calc.divide(5.0, 2.0), 1e-9);
    }

    @Test
    void divide_byZero_shouldThrow() {
        assertThrows(ArithmeticException.class, () -> calc.divide(1.0, 0.0));
    }

    @Test
    void factorial_shouldWork() {
        assertEquals(1L, calc.factorial(0));
        assertEquals(1L, calc.factorial(1));
        assertEquals(120L, calc.factorial(5));
    }

    @Test
    void factorial_negative_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> calc.factorial(-1));
    }
}
