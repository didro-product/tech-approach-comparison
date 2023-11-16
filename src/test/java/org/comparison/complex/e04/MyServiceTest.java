package org.comparison.complex.e04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private final MyService myService = new MyService();

    @Test
    public void testDetermineValueWhenValueIsNullAndBIsTrueThenReturnSumOfNAndA() {

        int n = 10;
        boolean b = true;
        String value = null;
        String result = myService.determineValue(n, b, value);
        assertEquals("105", result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullAndNGreaterThan20ThenReturnSumOfNValueAndAMultipliedBy4() {

        int n = 21;
        boolean b = true;
        String value = "test";
        String result = myService.determineValue(n, b, value);
        assertEquals("21test104", result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullAndNLessThanOrEqualTo20ThenReturnSumOfNValueAndLengthOfValue() {

        int n = 20;
        boolean b = true;
        String value = "test";
        String result = myService.determineValue(n, b, value);
        assertEquals("20test4", result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullAndNIsEqualTo11ThenReturnSumOfNValueAndAMinus4() {

        int n = 11;
        boolean b = true;
        String value = "test";
        String result = myService.determineValue(n, b, value);
        assertEquals("11test1", result);
    }

    @Test
    public void testDetermineValueWhenValueIsNullAndBIsFalseThenReturnSumOfNAndA() {

        int n = 10;
        boolean b = false;
        String value = null;
        String result = myService.determineValue(n, b, value);
        assertEquals("105", result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullAndBIsFalseThenReturnSumOfNValueAndA() {

        int n = 10;
        boolean b = false;
        String value = "test";
        String result = myService.determineValue(n, b, value);
        assertEquals("10test5", result);
    }
}