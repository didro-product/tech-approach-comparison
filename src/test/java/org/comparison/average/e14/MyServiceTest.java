package org.comparison.average.e14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFactorNot32AndValueLessThanOrEqualTo10ThenReturnConcatenatedStringWithUnderscore() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 31;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("10_a_10_21_26", result);
    }

    @Test
    public void testDetermineValueWhenFactor32AndValueGreaterThan10ThenReturnConcatenatedStringWithUnderscore() {
        // Arrange
        MyService myService = new MyService();
        int value = 11;
        int factor = 32;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("10_36_21_26", result);
    }

    @Test
    public void testDetermineValueWhenFactor32AndValueLessThanOrEqualTo10ThenReturnConcatenatedStringWithADelimiter() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 32;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("10a36a21a26", result);
    }
}