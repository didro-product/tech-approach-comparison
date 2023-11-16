package org.comparison.simple.e11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFactorIs22ThenReturnDifference() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 22;
        int s = 100;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        int expected = s - (12 + factor * value);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDetermineValueWhenFactorIsNot22ThenReturnDifference() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 21;
        int s = 100;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        int expected = s - (value + 10);
        Assertions.assertEquals(expected, result);
    }
}