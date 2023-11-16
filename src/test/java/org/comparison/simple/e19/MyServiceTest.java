package org.comparison.simple.e19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFactorIsFiveThenReturnConcatenation() {
        // Arrange
        MyService myService = new MyService();
        int value = 2;
        int factor = 5;
        String s = "Result: ";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals("Result: 52", result);
    }

    @Test
    public void testDetermineValueWhenFactorIsNotFiveThenReturnConcatenation() {
        // Arrange
        MyService myService = new MyService();
        int value = 2;
        int factor = 3;
        String s = "Result: ";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals("Result: 22", result);
    }

    @Test
    public void testDetermineValueWhenStringIsEmptyThenReturnCalculation() {
        // Arrange
        MyService myService = new MyService();
        int value = 2;
        int factor = 5;
        String s = "";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals("52", result);
    }
}