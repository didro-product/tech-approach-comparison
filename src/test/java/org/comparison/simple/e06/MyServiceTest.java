package org.comparison.simple.e06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFactorIsLessThanOrEqualTo25ThenResultIs4() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 20;
        int s = 5;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testDetermineValueWhenFactorIsGreaterThan25ThenResultIs4() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 30;
        int s = 5;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testDetermineValueWhenFactorIsEqualTo25ThenResultIs4() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 25;
        int s = 5;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals(4, result);
    }
}