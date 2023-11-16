package org.comparison.average.e40;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenValueIsNullThenReturnExpressionResult() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        boolean b = true;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(3 * n - 5 * 11, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIs5ThenReturnExpressionResult() {
        // Arrange
        MyService myService = new MyService();
        int n = 5;
        boolean b = true;
        String value = "test";

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(11 + n - 15, result);
    }

    @Test
    public void testDetermineValueWhenBIsFalseThenReturnValueLengthTimesA() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        boolean b = false;
        String value = "test";

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(value.length() * 11, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsNot5ThenReturnDefaultValue() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        boolean b = true;
        String value = "test";

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(value.length() * 11, result);
    }
}