package org.comparison.e22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenNGreaterThan45AndValueLengthGreaterThan7ThenReturnLengthTimes5() {
        // Arrange
        MyService myService = new MyService();
        int n = 50;
        String value = "abcdefghi";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        Assertions.assertEquals(value.length() * 5, result);
    }

    @Test
    public void testDetermineValueWhenNLessThanOrEqualTo45AndValueLengthGreaterThan7ThenReturn45TimesA() {
        // Arrange
        MyService myService = new MyService();
        int n = 40;
        String value = "abcdefghi";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        Assertions.assertEquals(45 * 45, result);
    }

    @Test
    public void testDetermineValueWhenNLessThanOrEqualTo45AndValueLengthLessThanOrEqualTo7ThenReturnNtimes11Plus25() {
        // Arrange
        MyService myService = new MyService();
        int n = 40;
        String value = "abc";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        Assertions.assertEquals(n * 11 + 25, result);
    }
}