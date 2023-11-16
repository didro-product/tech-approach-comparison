package org.comparison.average.e25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenNIs14AndValueLengthAfterAdding5Is6ThenReturn15() {
        // Arrange
        MyService myService = new MyService();
        int n = 14;
        String value = "abcde";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testDetermineValueWhenValueLengthIsLessThan6ThenReturn630() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        String value = "abc";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        assertEquals(630, result);
    }

    @Test
    public void testDetermineValueWhenNoneOfTheConditionsAreMetThenReturnMinus8() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        String value = "abcdef";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        assertEquals(-8, result);
    }
}