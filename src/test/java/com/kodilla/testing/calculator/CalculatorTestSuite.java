package com.kodilla.testing.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTestSuite {

    @Test
    void testAdd() {

        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(5, 7);

        // then
        Assertions.assertEquals(12, result);

    }

    @Test
    void testSubstract() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.substract(10, 5);

        // then
        Assertions.assertEquals(5, result);
    }
}
