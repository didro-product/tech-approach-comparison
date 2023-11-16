package org.comparison.average.e29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenInputIsLessThan10ThenReturnInputMultipliedBy11() {
        // Arrange
        MyService myService = new MyService();
        int input = 5;

        // Act
        int result = myService.determineValue(input);

        // Assert
        assertEquals(55, result, "When input is less than 10, the result should be input multiplied by 11");
    }

    @Test
    public void testDetermineValueWhenInputIsGreaterThan50ThenReturn103() {
        // Arrange
        MyService myService = new MyService();
        int input = 51;

        // Act
        int result = myService.determineValue(input);

        // Assert
        assertEquals(103, result, "When input is greater than 50, the result should be 103");
    }

    @Test
    public void testDetermineValueWhenInputIsBetween10And50ThenReturn22() {
        // Arrange
        MyService myService = new MyService();
        int input = 20;

        // Act
        int result = myService.determineValue(input);

        // Assert
        assertEquals(22, result, "When input is between 10 and 50, the result should be 22");
    }
}