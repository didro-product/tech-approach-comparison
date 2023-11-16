package org.comparison.simple.e16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private MyService myService;

    @BeforeEach
    public void setUp() {

        myService = new MyService();
    }

    @Test
    @DisplayName("Test the 'determineValue' method when the 'factor' is less than 30.")
    public void testDetermineValueWhenFactorLessThan30ThenReturnCorrectValue() {
        // Arrange
        int value = 5;
        int factor = 20;
        String s = "Test";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals("Test130", result);
    }

    @Test
    @DisplayName("Test the 'determineValue' method when the 'factor' is greater than or equal to 30.")
    public void testDetermineValueWhenFactorGreaterThanOrEqualTo30ThenReturnCorrectValue() {
        // Arrange
        int value = 5;
        int factor = 40;
        String s = "Test";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals("Test25", result);
    }
}