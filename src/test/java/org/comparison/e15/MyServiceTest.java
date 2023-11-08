package org.comparison.e15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private MyService myService = new MyService();

    @Test
    public void testDetermineValueWhenFactorNot12AndValueLessThanOrEqualTo10ThenReturnValue() {
        // Arrange
        int value = 10;
        int factor = 11;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("20_6_24_2", result);
    }

    @Test
    public void testDetermineValueWhenFactorNot12AndValueGreaterThan10ThenReturnValue() {
        // Arrange
        int value = 11;
        int factor = 11;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("20a48_30_2", result);
    }

    @Test
    public void testDetermineValueWhenFactor12AndValueLessThanOrEqualTo10ThenReturnValue() {
        // Arrange
        int value = 10;
        int factor = 12;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("20_10_24_2", result);
    }

    @Test
    public void testDetermineValueWhenFactor12AndValueGreaterThan10ThenReturnValue() {
        // Arrange
        int value = 11;
        int factor = 12;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("20a32_30_2", result);
    }
}