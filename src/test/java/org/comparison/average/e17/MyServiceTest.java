package org.comparison.average.e17;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private MyService myService = new MyService();

    @Test
    @DisplayName("Test determineValue when factor > 40 and value != 5")
    public void testDetermineValueWhenFactorGreaterThan40AndValueNotEqualTo5ThenReturnConcatenatedString() {
        // Arrange
        int value = 6;
        int factor = 41;
        int b = 2;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("4_20_10_16", result);
    }

    @Test
    @DisplayName("Test determineValue when factor <= 40 and value != 5")
    public void testDetermineValueWhenFactorLessThanOrEqualTo40AndValueNotEqualTo5ThenReturnConcatenatedString() {
        // Arrange
        int value = 6;
        int factor = 40;
        int b = 2;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("4_11_56_16", result);
    }

    @Test
    @DisplayName("Test determineValue when value = 5")
    public void testDetermineValueWhenValueEqualTo5ThenReturnConcatenatedStringWithDelimiterA() {
        // Arrange
        int value = 5;
        int factor = 40;
        int b = 2;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("4a15a10a16", result);
    }
}