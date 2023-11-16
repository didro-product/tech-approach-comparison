package org.comparison.average.e30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenBooleanIsTrueAndStringIsNullThenReturn185() {
        // Arrange
        MyService myService = new MyService();
        boolean b = true;
        String value = null;

        // Act
        int result = myService.determineValue(b, value);

        // Assert
        assertEquals(185, result);
    }

    @Test
    public void testDetermineValueWhenBooleanIsTrueAndStringIsNotNullThenReturnCorrectValue() {
        // Arrange
        MyService myService = new MyService();
        boolean b = true;
        String value = "test";

        // Act
        int result = myService.determineValue(b, value);

        // Assert
        assertEquals(33, result);
    }

    @Test
    public void testDetermineValueWhenBooleanIsFalseThenReturnCorrectValue() {
        // Arrange
        MyService myService = new MyService();
        boolean b = false;
        String value = "test";

        // Act
        int result = myService.determineValue(b, value);

        // Assert
        assertEquals(76, result);
    }
}