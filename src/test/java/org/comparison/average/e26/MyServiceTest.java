package org.comparison.average.e26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenBooleanIsTrueAndStringLengthIsLessThan15ThenReturn20() {
        // Arrange
        MyService myService = new MyService();
        String value = "Hello";

        // Act
        int result = myService.determineValue(true, value);

        // Assert
        assertEquals(20, result);
    }

    @Test
    public void testDetermineValueWhenBooleanIsTrueAndStringLengthIsEqualTo15ThenReturn225() {
        // Arrange
        MyService myService = new MyService();
        String value = "HelloHelloHelloH";

        // Act
        int result = myService.determineValue(true, value);

        // Assert
        assertEquals(225, result);
    }

    @Test
    public void testDetermineValueWhenBooleanIsTrueAndStringLengthIsGreaterThan15ThenReturnProductOf15AndStringLength() {
        // Arrange
        MyService myService = new MyService();
        String value = "HelloHelloHelloHello";

        // Act
        int result = myService.determineValue(true, value);

        // Assert
        assertEquals(15 * value.length(), result);
    }

    @Test
    public void testDetermineValueWhenBooleanIsFalseThenReturnProductOf30AndStringLength() {
        // Arrange
        MyService myService = new MyService();
        String value = "Hello";

        // Act
        int result = myService.determineValue(false, value);

        // Assert
        assertEquals(30 * value.length(), result);
    }
}