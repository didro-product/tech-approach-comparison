package org.comparison.average.e37;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Zabik
 */
public class MyServiceTest {

    private MyService myService;

    @BeforeEach
    public void setup() {

        myService = new MyService();
    }

    @Test
    public void testDetermineValueWhenValueIsNullThenReturnResultOfExpression() {

        int n = 2;
        boolean b = true;
        String value = null;
        int result = myService.determineValue(n, b, value);
        assertEquals(2, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsLessThan3ThenReturnResultOfExpression() {

        int n = 2;
        boolean b = true;
        String value = "test";
        int result = myService.determineValue(n, b, value);
        assertEquals(-18, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsGreaterThanOrEqualTo3ThenReturnResultOfExpression() {

        int n = 3;
        boolean b = true;
        String value = "test";
        int result = myService.determineValue(n, b, value);
        assertEquals(-1, result);
    }

    @Test
    public void testDetermineValueWhenBIsFalseThenReturnResultOfExpression() {

        int n = 3;
        boolean b = false;
        String value = "test";
        int result = myService.determineValue(n, b, value);
        assertEquals(-1, result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullAndBIsFalseThenReturnResultOfExpression() {

        int n = 3;
        boolean b = false;
        String value = "test";
        int result = myService.determineValue(n, b, value);
        assertEquals(-1, result);
    }
}