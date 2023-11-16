package org.comparison.complex.e05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenValueIsNullAndNIsLessThan10ThenReturnLengthOfValuePlusN() {

        MyService myService = new MyService();
        String result = myService.determineValue(5, false, null);
        assertEquals("null5", result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullAndNIsGreaterThan25ThenReturnN() {

        MyService myService = new MyService();
        String result = myService.determineValue(30, true, "test");
        assertEquals("30test30", result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullAndNIsLessThanOrEqualTo25ThenReturnNMultipliedBy4() {

        MyService myService = new MyService();
        String result = myService.determineValue(10, true, "test");
        assertEquals("40test10", result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndValueIsNotNullThenReturnNMultipliedBy4PlusValuePlusN() {

        MyService myService = new MyService();
        String result = myService.determineValue(10, true, "test");
        assertEquals("40test10", result);
    }

    @Test
    public void testDetermineValueWhenBIsFalseAndValueIsNotNullThenReturnValuePlusValuePlusN() {

        MyService myService = new MyService();
        String result = myService.determineValue(10, false, "test");
        assertEquals("20test10", result);
    }
}