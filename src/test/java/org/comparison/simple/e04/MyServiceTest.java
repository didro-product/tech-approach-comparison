package org.comparison.simple.e04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    private MyService myService = new MyService();

    @Test
    public void testDetermineValueWhenFactorIs13ThenReturnConcatenationOfInputStringAAndCalculationResult() {
        // Arrange
        int value = 5;
        int factor = 13;
        String s = "Test";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("Test2-1", result);
    }

    @Test
    public void testDetermineValueWhenFactorIsNot13ThenReturnConcatenationOfInputStringAAndCalculationResult() {
        // Arrange
        int value = 5;
        int factor = 10;
        String s = "Test";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("Test2105", result);
    }

    @Test
    public void testDetermineValueWhenInputStringIsEmptyThenReturnConcatenationOfAAndCalculationResult() {
        // Arrange
        int value = 5;
        int factor = 10;
        String s = "";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("2105", result);
    }
}