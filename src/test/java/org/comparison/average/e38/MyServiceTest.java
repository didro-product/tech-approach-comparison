package org.comparison.average.e38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenValueNotNullAndBooleanFalseThenReturnLengthOfValueMultipliedBy7() {
        // Arrange
        MyService myService = new MyService();
        int n = 5;
        boolean b = false;
        String value = "test";

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(7 * value.length(), result);
    }

    @Test
    public void testDetermineValueWhenValueNullAndBooleanTrueThenReturnAPlus3TimesN() {
        // Arrange
        MyService myService = new MyService();
        int n = 5;
        boolean b = true;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(20 + 3 * n, result);
    }

    @Test
    public void testDetermineValueWhenValueNullAndBooleanFalseThenReturnNPlus11Minus2TimesA() {
        // Arrange
        MyService myService = new MyService();
        int n = 5;
        boolean b = false;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(n + 11 - 2 * 20, result);
    }
}