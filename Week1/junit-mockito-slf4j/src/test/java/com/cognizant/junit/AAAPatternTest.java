package com.cognizant.junit;

import com.cognizant.service.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AAAPatternTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        int a = 10;
        int b = 5;

        int result = calculator.add(a, b);

        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        int a = 10;
        int b = 3;

        int result = calculator.subtract(a, b);

        assertEquals(7, result);
    }

    @Test
    public void testMultiply() {
        int a = 4;
        int b = 5;

        int result = calculator.multiply(a, b);

        assertEquals(20, result);
    }

    @Test
    public void testDivide() {
        double a = 10.0;
        double b = 2.0;

        double result = calculator.divide(a, b);

        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testDivideByZeroThrowsArithmeticException() {
        double a = 10.0;
        double b = 0.0;

        assertThrows(ArithmeticException.class, () -> calculator.divide(a, b));
    }
}
