package org.comparison.e20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    private MyService myService = new MyService();

    @Test
    public void testDetermineValueWhenFactorGreaterThan30AndValueLessThanOrEqualTo70ThenReturnBWithQuestionDelimiterAndC() {
        // Arrange
        int value = 50;
        int factor = 35;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        Assertions.assertEquals("2250?10", result);
    }

    @Test
    public void testDetermineValueWhenFactorGreaterThan30AndValueGreaterThan70ThenReturnBWithSDelimiterAndC() {
        // Arrange
        int value = 80;
        int factor = 35;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        Assertions.assertEquals("11s10", result);
    }

    @Test
    public void testDetermineValueWhenFactorLessThanOrEqualTo30ThenReturn15WithQuestionDelimiterAndC() {
        // Arrange
        int value = 50;
        int factor = 25;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
        Assertions.assertEquals("15?10", result);
    }
}