package org.comparison.e02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    @DisplayName("Test determineValue method when adaptedSize is equal to 10")
    public void testDetermineValueWhenAdaptedSizeIs10ThenReturnCoefPlusFirstArg() {
        // Arrange
        MyService myService = new MyService();
        String firstArg = "FirstArg";
        String defaultPass = "DefaultPass";
        int adaptedSize = 10;
        int factor = 5;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        Assertions.assertEquals("coefFirstArg", result);
    }

    @Test
    @DisplayName("Test determineValue method when adaptedSize is greater than 19 and factor is greater than 4")
    public void testDetermineValueWhenAdaptedSizeIsGreaterThan19AndFactorIsGreaterThan4ThenReturnCoefPlusProduct() {
        // Arrange
        MyService myService = new MyService();
        String firstArg = "FirstArg";
        String defaultPass = "DefaultPass";
        int adaptedSize = 20;
        int factor = 5;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        Assertions.assertEquals("coef100", result);
    }

    @Test
    @DisplayName("Test determineValue method when adaptedSize is greater than 19 and factor is not greater than 4")
    public void testDetermineValueWhenAdaptedSizeIsGreaterThan19AndFactorIsNotGreaterThan4ThenReturnCoefPlusAdaptedSize() {
        // Arrange
        MyService myService = new MyService();
        String firstArg = "FirstArg";
        String defaultPass = "DefaultPass";
        int adaptedSize = 20;
        int factor = 4;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        Assertions.assertEquals("coef20", result);
    }

    @Test
    @DisplayName("Test determineValue method when adaptedSize is less than or equal to 19")
    public void testDetermineValueWhenAdaptedSizeIsLessThanOrEqualTo19ThenReturnCoefPlusDefaultPass() {
        // Arrange
        MyService myService = new MyService();
        String firstArg = "FirstArg";
        String defaultPass = "DefaultPass";
        int adaptedSize = 19;
        int factor = 5;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        Assertions.assertEquals("coefDefaultPass", result);
    }
}