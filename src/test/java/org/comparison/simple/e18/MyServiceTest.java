package org.comparison.simple.e18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFactorLessThan4ThenReturnResult() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 3;
        String s = "Result: ";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("Result: 80", result);
    }

    @Test
    public void testDetermineValueWhenFactorGreaterThanOrEqualTo4ThenReturnResult() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 4;
        String s = "Result: ";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("Result: 12", result);
    }

    @Test
    public void testDetermineValueWhenFactorEqualTo0ThenReturnResult() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 0;
        String s = "Result: ";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("Result: 50", result);
    }
}