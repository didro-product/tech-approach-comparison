package org.comparison.average.e19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFactorLessThan19ThenReturnValueWithQuestionDelimiter() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 18;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("14?10", result);
    }

    @Test
    public void testDetermineValueWhenFactorGreaterThanOrEqual19ThenReturnValueWithSDelimiter() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 19;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("19s10", result);
    }

    @Test
    public void testDetermineValueWhenValueEquals15ThenReturnValueWithQuestionDelimiterAndProductOfAAndValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 15;
        int factor = 10;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        assertEquals("15?360", result);
    }
}