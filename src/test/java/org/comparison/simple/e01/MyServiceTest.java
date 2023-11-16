package org.comparison.simple.e01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFactorLessThan15ThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 10;
        String s = "test";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("10test105", result);
    }

    @Test
    public void testDetermineValueWhenFactorGreaterThanOrEqualTo15ThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 20;
        String s = "test";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("10test76", result);
    }
}