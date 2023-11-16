package org.comparison.average.e11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    private final MyService myService = new MyService();

    @Test
    @DisplayName("Test determineValue when factor is greater than 20")
    public void testDetermineValueWhenFactorIsGreaterThan20ThenReturnValueWithCalculatedBAndC() {
        // Arrange
        int value = 10;
        int factor = 21;
        int b = 5;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        Assertions.assertEquals("10_66_0_11", result);
    }

    @Test
    @DisplayName("Test determineValue when factor is less than or equal to 20")
    public void testDetermineValueWhenFactorIsLessThanOrEqualTo20ThenReturnValueWithGivenBAndCalculatedC() {
        // Arrange
        int value = 10;
        int factor = 20;
        int b = 5;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        Assertions.assertEquals("10_10_220_11", result);
    }

    @Test
    @DisplayName("Test determineValue when factor is greater than or equal to 25")
    public void testDetermineValueWhenFactorIsGreaterThanOrEqualTo25ThenReturnValueWithCalculatedBAndGivenC() {
        // Arrange
        int value = 10;
        int factor = 25;
        int b = 5;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        Assertions.assertEquals("10d625d10d11", result);
    }
}