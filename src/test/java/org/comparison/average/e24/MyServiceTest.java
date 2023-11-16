package org.comparison.average.e24;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    @DisplayName("Test determineValue method when n < 55 and value does not contain 'qtsa'")
    public void testDetermineValueWhenNLessThan55AndValueDoesNotContainQtsaThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        int n = 50;
        String value = "test";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        assertEquals(14 - (value.length() * 10), result);
    }

    @Test
    @DisplayName("Test determineValue method when n < 55 and value contains 'qtsa'")
    public void testDetermineValueWhenNLessThan55AndValueContainsQtsaThenReturn45Plus55() {
        // Arrange
        MyService myService = new MyService();
        int n = 50;
        String value = "qtsa";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        assertEquals(45 + 55, result);
    }

    @Test
    @DisplayName("Test determineValue method when n >= 55 and value does not contain 'qtsa'")
    public void testDetermineValueWhenNGreaterThanOrEqualTo55AndValueDoesNotContainQtsaThenReturn14MinusNBy12() {
        // Arrange
        MyService myService = new MyService();
        int n = 60;
        String value = "test";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        assertEquals(14 - (n / 12), result);
    }

    @Test
    @DisplayName("Test determineValue method when n >= 55 and value contains 'qtsa'")
    public void testDetermineValueWhenNGreaterThanOrEqualTo55AndValueContainsQtsaThenReturn14MinusNBy12() {
        // Arrange
        MyService myService = new MyService();
        int n = 60;
        String value = "qtsa";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        assertEquals(14 - (n / 12), result);
    }
}