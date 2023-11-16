package org.comparison.average.e31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private MyService myService = new MyService();

    @Test
    public void testDetermineValueWhenValueIsNullThenReturnProductOfAAnd5() {

        int n = 5;
        boolean b = true;
        String value = null;

        int result = myService.determineValue(n, b, value);

        assertEquals(185, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsGreaterThan3ThenReturnProductOfAAnd5() {

        int n = 4;
        boolean b = true;
        String value = "test";

        int result = myService.determineValue(n, b, value);

        assertEquals(185, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsLessThanOrEqualTo3ThenReturnProductOfAAnd5() {

        int n = 3;
        boolean b = true;
        String value = "test";

        int result = myService.determineValue(n, b, value);

        assertEquals(185, result);
    }

    @Test
    public void testDetermineValueWhenBIsFalseThenReturnProductOfALengthOfValuePlusN() {

        int n = 2;
        boolean b = false;
        String value = "test";

        int result = myService.determineValue(n, b, value);

        assertEquals(37 * value.length() + n, result);
    }
}