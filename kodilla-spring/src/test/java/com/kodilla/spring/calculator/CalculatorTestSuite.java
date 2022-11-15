package com.kodilla.spring.calculator;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    void testCalculations() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        double subResult = calculator.sub(5.5,5.5);
        double addResult = calculator.add(2.0,5.0);
        double mulResult = calculator.mul(2.0,2.0);
        double divResult = calculator.div(10.0, 2.0);


        assertEquals(0, subResult, 0.001);
        assertEquals(7, addResult, 0.001);
        assertEquals(4, mulResult, 0.001);
        assertEquals(5, divResult, 0.001);
    }
}
