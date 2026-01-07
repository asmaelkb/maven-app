
package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Exemple simple d'IT: simule une opération plus "lente" ou composite.
 * Failsafe générera des rapports XML séparés (integration-test phase).
 */
class CalculatorIT {

    @Test
    void compositeOperation_shouldWork() {
        Calculator c = new Calculator();
        double result = c.divide(c.add(10, 5), c.multiply(2, 3)); // (10+5)/(2*3) = 15/6 = 2.5
        assertEquals(2.5, result, 1e-9);
        assertTrue(false);
    }
}
