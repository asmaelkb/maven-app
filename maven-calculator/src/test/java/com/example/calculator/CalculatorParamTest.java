
package com.example.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorParamTest {

    private final Calculator calc = new Calculator();

    @ParameterizedTest(name = "add({0}, {1}) = {2}")
    @CsvSource({
        "0,0,0",
        "1,2,3",
        "-3,5,2",
        "100,-1,99"
    })
    void add_parameterized(int a, int b, int expected) {
        assertEquals(expected, calc.add(a, b));
    }

    @ParameterizedTest(name = "multiply({0}, {1}) = {2}")
    @CsvSource({
        "0,10,0",
        "2,3,6",
        "-2,4,-8",
        "-3,-3,9"
    })
    void multiply_parameterized(int a, int b, int expected) {
        assertEquals(expected, calc.multiply(a, b));
    }
}
