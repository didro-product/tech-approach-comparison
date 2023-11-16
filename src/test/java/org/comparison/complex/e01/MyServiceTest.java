package org.comparison.complex.e01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private MyService myService = new MyService();

    @Test
    public void testDetermineValueWhenValueIsNullAndBIsFalseThenReturnSumOfNAndA() {

        int n = 10;
        boolean b = false;
        String value = null;
        String expected = n + "null5";
        assertEquals(expected, myService.determineValue(n, b, value));
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullAndNIsGreaterThanOrEqualTo10ThenReturnSumOfNValueAndLengthOfValue() {

        int n = 10;
        boolean b = false;
        String value = "test";
        String expected = n + value + value.length();
        assertEquals(expected, myService.determineValue(n, b, value));
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullAndNIsLessThan10ThenReturnSumOfNValueAndNPlus5() {

        int n = 5;
        boolean b = false;
        String value = "test";
        String expected = n + value + (n + 5);
        assertEquals(expected, myService.determineValue(n, b, value));
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsGreaterThanOrEqualToMinus21ThenReturnSumOfNValueAndN() {

        int n = -20;
        boolean b = true;
        String value = "test";
        String expected = n + value + n;
        assertEquals(expected, myService.determineValue(n, b, value));
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsLessThanMinus21ThenReturnSumOfNValueAnd2N() {

        int n = -22;
        boolean b = true;
        String value = "test";
        String expected = n + value + (2 * n);
        assertEquals(expected, myService.determineValue(n, b, value));
    }
}