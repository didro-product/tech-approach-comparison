package org.comparison.e08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private MyService myService;

    @BeforeEach
    public void setUp() {

        myService = new MyService();
    }

    @Test
    public void testDetermineValueWhenFirstStringIsFailThenReturnConcatenationOfNumAndDefaultPass() {
        // Arrange
        String firstString = "fail";
        String defaultPass = "defaultPass";
        int adaptedSize = 10;
        int factor = 5;

        // Act
        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("num" + defaultPass, result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeIsGreaterThan16ThenReturnDivisionOfSumAndUnderscore() {
        // Arrange
        String firstString = "notFail";
        String defaultPass = "defaultPass";
        int adaptedSize = 20;
        int factor = 10;

        // Act
        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("3_", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeIsLessThanOrEqualTo16ThenReturnDefaultPass() {
        // Arrange
        String firstString = "notFail";
        String defaultPass = "defaultPass";
        int adaptedSize = 10;
        int factor = 5;

        // Act
        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals(defaultPass, result);
    }
}