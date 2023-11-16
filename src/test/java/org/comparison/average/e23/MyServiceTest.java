package org.comparison.average.e23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenBooleanIsTrueAndStringContainsAbcdThenReturn41() {
        // Arrange
        MyService myService = new MyService();
        boolean b = true;
        String value = "xyzabcd";

        // Act
        int result = myService.determineValue(b, value);

        // Assert
        assertEquals(41, result);
    }

    @Test
    public void testDetermineValueWhenBooleanIsTrueAndStringDoesNotContainAbcdThenReturn28() {
        // Arrange
        MyService myService = new MyService();
        boolean b = true;
        String value = "xyz";

        // Act
        int result = myService.determineValue(b, value);

        // Assert
        assertEquals(28, result);
    }

    @Test
    public void testDetermineValueWhenBooleanIsFalseThenReturnStringLengthPlus13() {
        // Arrange
        MyService myService = new MyService();
        boolean b = false;
        String value = "xyz";

        // Act
        int result = myService.determineValue(b, value);

        // Assert
        assertEquals(16, result);
    }
}