package com.cognizant.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class AssertionsTest {

    @Test
    public void testAssertEquals() {
        assertEquals(5, 2 + 3);
    }

    @Test
    public void testAssertTrue() {
        assertTrue(5 > 3);
    }

    @Test
    public void testAssertFalse() {
        assertFalse(5 < 3);
    }

    @Test
    public void testAssertNull() {
        assertNull(null);
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull(new Object());
    }
}
