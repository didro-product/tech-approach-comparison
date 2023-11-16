package org.comparison.complex.e03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenNLessThan15AndBTrueThenReturnSumOfNAndA() {

        MyService myService = new MyService();
        String result = myService.determineValue(10, true, null);
        assertEquals("1010", result);
    }

    @Test
    public void testDetermineValueWhenNEqualTo15AndBTrueThenReturnSumOfNAndA() {

        MyService myService = new MyService();
        String result = myService.determineValue(15, true, null);
        assertEquals("151", result);
    }

    @Test
    public void testDetermineValueWhenNGreaterThan15AndBTrueThenReturnSumOfNAndA() {

        MyService myService = new MyService();
        String result = myService.determineValue(20, true, null);
        assertEquals("203", result);
    }

    @Test
    public void testDetermineValueWhenNLessThan15AndBFalseThenReturnSumOfNAndA() {

        MyService myService = new MyService();
        String result = myService.determineValue(10, false, null);
        assertEquals("101", result);
    }

    @Test
    public void testDetermineValueWhenNEqualTo15AndBFalseThenReturnSumOfNAndA() {

        MyService myService = new MyService();
        String result = myService.determineValue(15, false, null);
        assertEquals("151", result);
    }

    @Test
    public void testDetermineValueWhenNGreaterThan15AndBFalseThenReturnSumOfNAndA() {

        MyService myService = new MyService();
        String result = myService.determineValue(20, false, null);
        assertEquals("201", result);
    }

    @Test
    public void testDetermineValueWhenValueNotNullAndNLessThan15ThenReturnConcatenationOfNValueAndA() {

        MyService myService = new MyService();
        String result = myService.determineValue(10, true, "test");
        assertEquals("10test4", result);
    }

    @Test
    public void testDetermineValueWhenValueNotNullAndNGreaterThanOrEqualTo15ThenReturnConcatenationOfNValueAndA() {

        MyService myService = new MyService();
        String result = myService.determineValue(20, true, "test");
        assertEquals("20test13", result);
    }

    @Test
    public void testDetermineValueWhenValueNullThenReturnConcatenationOfNValueAndA() {

        MyService myService = new MyService();
        String result = myService.determineValue(20, true, null);
        assertEquals("20null3", result);
    }
}