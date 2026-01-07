
package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private final MathUtils utils = new MathUtils();

    @Test
    void isEven_shouldWork() {
        assertTrue(utils.isEven(2));
        assertFalse(utils.isEven(3));
        assertTrue(utils.isEven(0));
        assertTrue(utils.isEven(-4));
    }

    @Test
    void clamp_shouldClampWithinBounds() {
        assertEquals(5, utils.clamp(5, 0, 10));
        assertEquals(0, utils.clamp(-3, 0, 10));
        assertEquals(10, utils.clamp(999, 0, 10));
    }

    @Test
    void clamp_invalidRange_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> utils.clamp(1, 10, 0));
    }

    @Test
    void safeParseInt_shouldFallback() {
        assertEquals(42, utils.safeParseInt("42", -1));
        assertEquals(-1, utils.safeParseInt("NaN", -1));
        assertEquals(0, utils.safeParseInt("", 0));
    }
}
