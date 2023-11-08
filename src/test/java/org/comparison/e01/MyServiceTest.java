package org.comparison.e01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFirstArgIs113ThenReturnConcatenationOf45AndDefaultPass() {
        // Arrange
        MyService myService = new MyService();
        int firstArg = 113;
        String defaultPass = "defaultPass";
        int adaptedSize = 10;
        int factor = 2;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("45defaultPass", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeIsGreaterThan14AndCalculatedValueIsGreaterThanFirstArgThenReturnConcatenationOf45AndFirstArg() {
        // Arrange
        MyService myService = new MyService();
        int firstArg = 10;
        String defaultPass = "defaultPass";
        int adaptedSize = 15;
        int factor = 2;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("4510", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeIsGreaterThan14AndCalculatedValueIsLessThanOrEqualToFirstArgThenReturnConcatenationOfFirstArgAndDefaultPass() {
        // Arrange
        MyService myService = new MyService();
        int firstArg = 20;
        String defaultPass = "defaultPass";
        int adaptedSize = 15;
        int factor = 2;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("20_defaultPass", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeIsLessThanOrEqualTo14ThenReturnConcatenationOfDefaultPassAnd45() {
        // Arrange
        MyService myService = new MyService();
        int firstArg = 10;
        String defaultPass = "defaultPass";
        int adaptedSize = 10;
        int factor = 2;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("defaultPass45", result);
    }
}