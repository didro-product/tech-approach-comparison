package org.comparison.average.e03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFirstArgLengthGreaterThan5ThenReturnCoefFirstArg() {
        // Arrange
        MyService myService = new MyService();
        String firstArg = "abcdef";
        String defaultPass = "default";
        int adaptedSize = 10;
        int factor = 2;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("coefabcdef", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeLessThan15AndFactorNotEqual1ThenReturnCoefAdaptedSizeTimesFactor() {
        // Arrange
        MyService myService = new MyService();
        String firstArg = "abc";
        String defaultPass = "default";
        int adaptedSize = 10;
        int factor = 2;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("coef20", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeLessThan15AndFactorEqual1ThenReturnCoefAdaptedSize() {
        // Arrange
        MyService myService = new MyService();
        String firstArg = "abc";
        String defaultPass = "default";
        int adaptedSize = 10;
        int factor = 1;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("coef10", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeGreaterThanOrEqualTo15ThenReturnCoefDefault() {
        // Arrange
        MyService myService = new MyService();
        String firstArg = "abc";
        String defaultPass = "default";
        int adaptedSize = 20;
        int factor = 2;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("coefdefault", result);
    }
}