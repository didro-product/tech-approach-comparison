package org.comparison.e18;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    @DisplayName("Test determineValue when factor > 30 and value < 5")
    public void testDetermineValueWhenFactorGreaterThan30AndValueLessThan5ThenReturnCorrectValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 3;
        int factor = 40;
        int b = 10;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("2?18", result);
    }

    @Test
    @DisplayName("Test determineValue when factor <= 30 and value > 5")
    public void testDetermineValueWhenFactorLessThanOrEqualTo30AndValueGreaterThan5ThenReturnCorrectValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 20;
        int b = 10;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("204?15", result);
    }

    @Test
    @DisplayName("Test determineValue when factor <= 30 and value <= 5")
    public void testDetermineValueWhenFactorLessThanOrEqualTo30AndValueLessThanOrEqualTo5ThenReturnCorrectValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 20;
        int b = 10;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("104s18", result);
    }
}