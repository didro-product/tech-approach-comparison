package org.comparison.simple.e17;

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
    public void testDetermineValueWhenFactorGreaterThanSixThenReturnConcatenatedString() {
        // Arrange
        int value = 5;
        int factor = 7;
        String s = "Test";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("Test-4", result);
    }

    @Test
    public void testDetermineValueWhenFactorLessThanOrEqualToSixThenReturnConcatenatedString() {
        // Arrange
        int value = 5;
        int factor = 6;
        String s = "Test";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("Test55", result);
    }
}