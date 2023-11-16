package org.comparison.average.e39;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private MyService myService = new MyService();

    @Test
    public void testDetermineValueWhenValueNotNullThenReturnValue() {
        // Arrange
        int n = 10;
        boolean b = true;
        String value = "test";

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(25 * value.length() - 5, result);
    }

    @Test
    public void testDetermineValueWhenValueNullAndBooleanTrueThenReturnValue() {
        // Arrange
        int n = 10;
        boolean b = true;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(5 * 4 + n, result);
    }

    @Test
    public void testDetermineValueWhenValueNullAndBooleanFalseThenReturnValue() {
        // Arrange
        int n = 10;
        boolean b = false;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(-n * 5, result);
    }
}