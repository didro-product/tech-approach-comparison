package org.comparison.average.e16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFactorIsLessThan10ThenReturnStringWithCalculatedValues() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 9;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        Assertions.assertEquals("10_76_5", result);
    }

    @Test
    public void testDetermineValueWhenFactorIsBetween10And15ThenReturnStringWithCalculatedValues() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 12;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        Assertions.assertEquals("10_10_5", result);
    }

    @Test
    public void testDetermineValueWhenFactorIsGreaterThan15ThenReturnStringWithCalculatedValues() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 16;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        Assertions.assertEquals("10d70d5", result);
    }
}