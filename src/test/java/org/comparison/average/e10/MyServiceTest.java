package org.comparison.average.e10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFirstStringLengthNotEqual7ThenReturnDefaultPass() {
        // Arrange
        MyService myService = new MyService();
        String firstString = "123456";
        String defaultPass = "defaultPass";
        int adaptedSize = 10;
        int factor = 2;

        // Act
        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        // Assert
        Assertions.assertEquals(defaultPass, result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeGreaterThan15ThenReturnSumOfAdaptedSizeAndFactorTimes8WithUnderscore() {
        // Arrange
        MyService myService = new MyService();
        String firstString = "1234567";
        String defaultPass = "defaultPass";
        int adaptedSize = 16;
        int factor = 2;

        // Act
        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        // Assert
        Assertions.assertEquals(adaptedSize + factor * 8 + "_", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeLessThanOrEqualTo15ThenReturnNum() {
        // Arrange
        MyService myService = new MyService();
        String firstString = "1234567";
        String defaultPass = "defaultPass";
        int adaptedSize = 15;
        int factor = 2;

        // Act
        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        // Assert
        Assertions.assertEquals("num", result);
    }
}