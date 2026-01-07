
package com.example.calculator;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

/**
 * Suite JUnit 5: regroupe tous les tests pertinents.
 * Exécution: `mvn -q -Dtest=com.example.calculator.AllTestsSuite test`
 */
@Suite
@SelectPackages("com.example.calculator")
@SelectClasses({
    CalculatorTest.class,
    CalculatorParamTest.class,
    CalculatorEdgeCasesTest.class,
    MathUtilsTest.class
})
public class AllTestsSuite {
    // Aucun code nécessaire : la suite est définie par les annotations
}
