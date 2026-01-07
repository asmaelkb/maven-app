
package com.example.calculator;

public class MathUtils {

    public boolean isEven(int n) {
        return (n % 2) == 0;
    }

    public int clamp(int value, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min cannot be greater than max");
        }
        return Math.max(min, Math.min(max, value));
    }

    public int safeParseInt(String s, int defaultValue) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
}
