package org.comparison.simple.e20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFactorGreaterThan11ThenReturnSum() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 12;
        int s = 3;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals(s + (9 + factor * value), result);
    }

    @Test
    public void testDetermineValueWhenFactorLessThanOrEqualTo11ThenReturnSum() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 10;
        int s = 3;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals(s + (78 - value), result);
    }
}