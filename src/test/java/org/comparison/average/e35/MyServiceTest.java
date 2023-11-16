package org.comparison.average.e35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private MyService myService = new MyService();

    @Test
    public void testDetermineValueWhenValueIsNullThenReturnProductOfNAndA() {

        int n = 5;
        boolean b = true;
        String value = null;

        int result = myService.determineValue(n, b, value);

        assertEquals(n * 20, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNGreaterThan20ThenReturn10PlusA() {

        int n = 25;
        boolean b = true;
        String value = "test";

        int result = myService.determineValue(n, b, value);

        assertEquals(10 + 20, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNLessThanOrEqualTo20ThenReturn2APlusValueLengthMinusN() {

        int n = 15;
        boolean b = true;
        String value = "test";

        int result = myService.determineValue(n, b, value);

        assertEquals(2 * 20 + value.length() - n, result);
    }

    @Test
    public void testDetermineValueWhenBIsFalseThenReturn2APlusValueLengthMinusN() {

        int n = 15;
        boolean b = false;
        String value = "test";

        int result = myService.determineValue(n, b, value);

        assertEquals(2 * 20 + value.length() - n, result);
    }
}