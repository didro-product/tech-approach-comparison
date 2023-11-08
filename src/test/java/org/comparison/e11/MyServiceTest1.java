package org.comparison.e11;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest1 {

    private MyService myService = new MyService();

    @Test
    @DisplayName("Test determineValue when factor is greater than 20")
    public void testDetermineValueWhenFactorIsGreaterThan20ThenReturnValue() {
        // Arrange
        int value = 10;
        int factor = 21;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("10_66_0_11", result);
    }

    @Test
    @DisplayName("Test determineValue when factor is less than or equal to 20")
    public void testDetermineValueWhenFactorIsLessThanOrEqualTo20ThenReturnValue() {
        // Arrange
        int value = 10;
        int factor = 20;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("10_10_220_11", result);
    }

    @Test
    @DisplayName("Test determineValue when factor is less than 25")
    public void testDetermineValueWhenFactorIsLessThan25ThenReturnValue() {
        // Arrange
        int value = 10;
        int factor = 24;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("10_240_0_11", result);
    }

    @Test
    @DisplayName("Test determineValue when factor is greater than or equal to 25")
    public void testDetermineValueWhenFactorIsGreaterThanOrEqualTo25ThenReturnValue() {
        // Arrange
        int value = 10;
        int factor = 25;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("10_625_20_11", result);
    }
}