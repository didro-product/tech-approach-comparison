package org.comparison.average.e32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenValueIsNullThenReturn4TimesA() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        boolean b = true;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(400, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsLessThanOrEqualTo22ThenReturn8TimesA() {
        // Arrange
        MyService myService = new MyService();
        int n = 22;
        boolean b = true;
        String value = "test";

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(800, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsGreaterThan22ThenReturnNMinusADividedByValueLength() {
        // Arrange
        MyService myService = new MyService();
        int n = 23;
        boolean b = true;
        String value = "test";

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(n - 100 / value.length(), result);
    }

    @Test
    public void testDetermineValueWhenBIsFalseThenReturnNMinusADividedByValueLength() {
        // Arrange
        MyService myService = new MyService();
        int n = 23;
        boolean b = false;
        String value = "test";

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        assertEquals(n - 100 / value.length(), result);
    }
}