
package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorEdgeCasesTest {

    private final Calculator calc = new Calculator();

    @Test
    void divide_precisionEdge() {
        double result = calc.divide(1.0, 3.0);
        assertEquals(0.3333333333, result, 1e-9);
    }

    @Test
    void factorial_largeButSafe() {
        // 20! tient dans un long (limite approximative)
        assertEquals(2432902008176640000L, calc.factorial(20));
    }
}
