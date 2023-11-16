package org.comparison.average.e28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenValueIsNullAndNIsLessThanOrEqualTo15ThenReturn22() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        String value = null;

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        assertEquals(22, result);
    }

    @Test
    public void testDetermineValueWhenValueIsNullAndNIsGreaterThan15ThenReturn22() {
        // Arrange
        MyService myService = new MyService();
        int n = 20;
        String value = null;

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        assertEquals(22, result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullAndNIsLessThanOrEqualTo15ThenReturnExpectedValue() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        String value = "test";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        assertEquals(3 * (44 - n) + n, result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullAndNIsGreaterThan15ThenReturnExpectedValue() {
        // Arrange
        MyService myService = new MyService();
        int n = 20;
        String value = "test";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        assertEquals(3 * (value.length() * 3 + 8) + n, result);
    }
}