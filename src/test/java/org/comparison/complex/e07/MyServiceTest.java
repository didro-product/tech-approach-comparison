package org.comparison.complex.e07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenBIsTrueAndNGreaterThan60ThenReturn25PlusN() {

        MyService myService = new MyService();
        int n = 70;
        boolean b = true;
        String value = null;
        int result = myService.determineValue(n, b, value);
        assertEquals(25 + n, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNLessThanOrEqualTo60ButGreaterThan15ThenReturn16Times22PlusN() {

        MyService myService = new MyService();
        int n = 30;
        boolean b = true;
        String value = null;
        int result = myService.determineValue(n, b, value);
        assertEquals(16 * 22 + n, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNLessThanOrEqualTo15ThenReturnNPlusN() {

        MyService myService = new MyService();
        int n = 10;
        boolean b = true;
        String value = null;
        int result = myService.determineValue(n, b, value);
        assertEquals(n + n, result);
    }

    @Test
    public void testDetermineValueWhenBIsFalseThenReturn10PlusN() {

        MyService myService = new MyService();
        int n = 20;
        boolean b = false;
        String value = null;
        int result = myService.determineValue(n, b, value);
        assertEquals(10 + n, result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullThenReturn10PlusNMinusValueLengthPlusN() {

        MyService myService = new MyService();
        int n = 20;
        boolean b = false;
        String value = "test";
        int result = myService.determineValue(n, b, value);
        assertEquals(10 + n - value.length() + n, result);
    }
}