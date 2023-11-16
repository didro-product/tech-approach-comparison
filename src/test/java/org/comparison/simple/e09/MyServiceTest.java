package org.comparison.simple.e09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    private MyService myService;

    @BeforeEach
    public void setup() {

        myService = new MyService();
    }

    @Test
    public void testDetermineValueWhenFactorGreaterThan30ThenReturnCorrectValue() {
        // Arrange
        int value = 10;
        int factor = 40;
        int s = 5;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        int expected = s + (4 * factor - value);
        Assertions.assertEquals(expected, result, "The result should be the sum of s and the result of the calculation (4 * factor - value)");
    }

    @Test
    public void testDetermineValueWhenFactorLessThanOrEqualTo30ThenReturnCorrectValue() {
        // Arrange
        int value = 10;
        int factor = 20;
        int s = 5;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        int expected = s + (value * 5);
        Assertions.assertEquals(expected, result, "The result should be the sum of s and the result of the calculation (value * 5)");
    }
}