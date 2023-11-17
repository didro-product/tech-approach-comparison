package org.comparison.complex.e09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenBIsTrueAndNGreaterThan40ThenReturn17PlusN() {
        // Arrange
        MyService myService = new MyService();
        int n = 45;
        boolean b = true;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(17 + n, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNLessThanOrEqualTo40ThenReturn12PlusN() {
        // Arrange
        MyService myService = new MyService();
        int n = 40;
        boolean b = true;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(12 + n, result);
    }

    @Test
    public void testDetermineValueWhenBIsFalseThenReturn2PlusN() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        boolean b = false;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(2 + n, result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullThenReturnLengthOfValuePlus2PlusN() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        boolean b = false;
        String value = "test";

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(value.length() + 2 + n, result);
    }

    @Test
    public void testDetermineValueWhenAllParametersAreAtMinimumThenReturn2() {
        // Arrange
        MyService myService = new MyService();
        int n = 0;
        boolean b = false;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(2, result);
    }
}