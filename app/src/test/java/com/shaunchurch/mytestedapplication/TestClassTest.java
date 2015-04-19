package com.shaunchurch.mytestedapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassTest {

    TestClass testClass;

    @Before
    public void setUp() {
        testClass = new TestClass();
    }

    @Test
    public void testInteger() {
        // assertTrue(false);
        assertEquals(1, testClass.integer);
    }

    @Test
    public void testDoubleInteger() {
        assertEquals(2, testClass.doubleInteger());
    }

    @Test
    public void testMatchDate() {
        assertEquals("19-04-2015", testClass.matchDate("The date is 19-04-2015 and the time is 10:14 PM"));
    }
}