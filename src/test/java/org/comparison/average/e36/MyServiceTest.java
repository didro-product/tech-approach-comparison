package org.comparison.average.e36;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenValueIsNullThenReturnNMinusA() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        boolean b = false;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(n - 5, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsFourThenReturnSixMinusAN() {
        // Arrange
        MyService myService = new MyService();
        int n = 4;
        boolean b = true;
        String value = "test";

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(6 - 5 * n, result);
    }

    @Test
    public void testDetermineValueWhenBIsFalseAndValueIsNotNullThenReturnAValueMinusValueLengthPlusFiveTimesN() {
        // Arrange
        MyService myService = new MyService();
        int n = 3;
        boolean b = false;
        String value = "test";

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(5 - value.length() + 5 * n, result);
    }
}