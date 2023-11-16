package org.comparison.simple.e03;

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
    public void testDetermineValueWhenFactorGreaterThan6ThenReturnCorrectValue() {
        // Arrange
        int value = 2;
        int factor = 7;
        String s = "Test";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("5Test-9", result, "The result should be '5Test-9' when factor is greater than 6");
    }

    @Test
    public void testDetermineValueWhenFactorLessThanOrEqualTo6ThenReturnCorrectValue() {
        // Arrange
        int value = 2;
        int factor = 6;
        String s = "Test";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("5Test5", result, "The result should be '5Test5' when factor is less than or equal to 6");
    }
}