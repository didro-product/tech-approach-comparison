package org.comparison.average.e21;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenBooleanIsTrueAndStringContainsAbcThenReturn34() {
        // Arrange
        MyService myService = new MyService();
        boolean b = true;
        String value = "xyzabc";

        // Act
        int result = myService.determineValue(b, value);

        // Assert
        assertEquals(34, result);
    }

    @Test
    public void testDetermineValueWhenBooleanIsTrueAndStringDoesNotContainAbcThenReturn48() {
        // Arrange
        MyService myService = new MyService();
        boolean b = true;
        String value = "xyz";

        // Act
        int result = myService.determineValue(b, value);

        // Assert
        assertEquals(48, result);
    }

    @Test
    public void testDetermineValueWhenBooleanIsFalseThenReturnStringLengthPlus100() {
        // Arrange
        MyService myService = new MyService();
        boolean b = false;
        String value = "xyz";

        // Act
        int result = myService.determineValue(b, value);

        // Assert
        assertEquals(103, result);
    }
}