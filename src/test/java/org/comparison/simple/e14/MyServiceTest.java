package org.comparison.simple.e14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFactorLessThan5ThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 4;
        int s = 5;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals(20, result);
    }

    @Test
    public void testDetermineValueWhenFactorGreaterOrEqualTo5ThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 6;
        int s = 5;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals(40, result);
    }

    @Test
    public void testDetermineValueWhenFactorEqualTo5ThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 5;
        int s = 5;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals(40, result);
    }
}