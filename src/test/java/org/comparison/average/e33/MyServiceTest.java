package org.comparison.average.e33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private MyService myService = new MyService();

    @Test
    public void testDetermineValueWhenValueNotNullAndBooleanFalseThenReturnValueLengthTimesTenMinusFive() {

        int result = myService.determineValue(0, false, "test");
        assertEquals(35, result);
    }

    @Test
    public void testDetermineValueWhenValueNullAndBooleanTrueAndIntegerGreaterThan80ThenReturnTwenty() {

        int result = myService.determineValue(81, true, null);
        assertEquals(20, result);
    }

    @Test
    public void testDetermineValueWhenValueNullAndBooleanTrueAndIntegerLessThanOrEqualTo80ThenReturnIntegerMinusForty() {

        int result = myService.determineValue(80, true, null);
        assertEquals(40, result);
    }

    @Test
    public void testDetermineValueWhenValueNullAndBooleanFalseThenReturnIntegerMinusForty() {

        int result = myService.determineValue(50, false, null);
        assertEquals(10, result);
    }

    @Test
    public void testDetermineValueWhenValueNotNullAndBooleanTrueAndIntegerGreaterThan80ThenReturnTwenty() {

        int result = myService.determineValue(81, true, "test");
        assertEquals(20, result);
    }
}