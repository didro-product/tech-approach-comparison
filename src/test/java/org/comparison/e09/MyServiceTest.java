package org.comparison.e09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFirstStringLengthIs5ThenReturnDefaultPass() {
        // Arrange
        MyService myService = new MyService();
        String firstString = "abcde";
        String defaultPass = "defaultPass";
        int adaptedSize = 30;
        int factor = 10;

        // Act
        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals(defaultPass, result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeIsLessThan25ThenReturnAdaptedSizeConcatenatedWithUnderscore() {
        // Arrange
        MyService myService = new MyService();
        String firstString = "abcdef";
        String defaultPass = "defaultPass";
        int adaptedSize = 20;
        int factor = 10;

        // Act
        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals(adaptedSize + factor / 10 + "_", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeIsGreaterThanOrEqualTo25ThenReturnNum() {
        // Arrange
        MyService myService = new MyService();
        String firstString = "abcdef";
        String defaultPass = "defaultPass";
        int adaptedSize = 30;
        int factor = 10;

        // Act
        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("num", result);
    }
}