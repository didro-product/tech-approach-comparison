package org.comparison.simple.e12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFactorLessThanOrEqualTo15ThenReturnCorrectValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 5;
        int s = 100;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals(10, result);
    }

    @Test
    public void testDetermineValueWhenFactorGreaterThan15ThenReturnCorrectValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 20;
        int s = 100;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals(75, result);
    }
}