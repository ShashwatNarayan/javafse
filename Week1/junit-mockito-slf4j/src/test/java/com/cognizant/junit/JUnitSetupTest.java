package com.cognizant.junit;

import com.cognizant.service.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JUnitSetupTest {

    @Test
    public void testAdditionReturnsCorrectSum() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtractionReturnsCorrectDifference() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.subtract(9, 5));
    }
}
