package org.comparison.e13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    private final MyService myService = new MyService();

    @Test
    public void testDetermineValueWhenFactorLessThan10AndValueEquals10ThenReturnValue() {
        // Arrange
        int value = 10;
        int factor = 9;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        Assertions.assertEquals("10_56_20_26", result);
    }

    @Test
    public void testDetermineValueWhenFactorLessThan10AndValueNotEquals10ThenReturnValue() {
        // Arrange
        int value = 9;
        int factor = 9;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        Assertions.assertEquals("10d-6d5d26", result);
    }

    @Test
    public void testDetermineValueWhenFactorGreaterThanOrEqual10AndValueEquals10ThenReturnValue() {
        // Arrange
        int value = 10;
        int factor = 10;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        Assertions.assertEquals("10_10_20_26", result);
    }

    @Test
    public void testDetermineValueWhenFactorGreaterThanOrEqual10AndValueNotEquals10ThenReturnValue() {
        // Arrange
        int value = 9;
        int factor = 10;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        Assertions.assertEquals("10d-16d5d26", result);
    }
}