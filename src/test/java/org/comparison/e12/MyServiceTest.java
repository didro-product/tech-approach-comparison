package org.comparison.e12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFactorLessThan10ThenReturnConcatenatedString() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 9;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("10_60_5_26", result);
    }

    @Test
    public void testDetermineValueWhenFactorBetween10And15ThenReturnConcatenatedString() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 14;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("10d40d364d26", result);
    }

    @Test
    public void testDetermineValueWhenFactorGreaterThan15ThenReturnConcatenatedString() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 16;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("10_15_15_26", result);
    }
}