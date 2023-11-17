package org.comparison.complex.e06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenBooleanTrueAndIntegerLessThan10ThenReturn150() {

        MyService myService = new MyService();
        int result = myService.determineValue(5, true, null);
        Assertions.assertEquals(150, result);
    }

    @Test
    public void testDetermineValueWhenBooleanTrueAndIntegerBetween10And25ThenReturnIntegerTimes10() {

        MyService myService = new MyService();
        int result = myService.determineValue(15, true, null);
        Assertions.assertEquals(150, result);
    }

    @Test
    public void testDetermineValueWhenBooleanTrueAndIntegerGreaterThanOrEqualTo25ThenReturnIntegerTimes10Times6() {

        MyService myService = new MyService();
        int result = myService.determineValue(30, true, null);
        Assertions.assertEquals(1200, result);
    }

    @Test
    public void testDetermineValueWhenBooleanFalseThenReturn200() {

        MyService myService = new MyService();
        int result = myService.determineValue(0, false, null);
        Assertions.assertEquals(200, result);
    }

    @Test
    public void testDetermineValueWhenStringNotNullThenReturnStringLengthPlus200() {

        MyService myService = new MyService();
        int result = myService.determineValue(0, false, "test");
        Assertions.assertEquals(204, result);
    }

    @Test
    public void testDetermineValueWhenAllParametersDefaultThenReturn200() {

        MyService myService = new MyService();
        int result = myService.determineValue(0, false, null);
        Assertions.assertEquals(200, result);
    }
}