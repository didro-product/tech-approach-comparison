package org.comparison.complex.e10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsLessThan20ThenReturnSumOfNAnd50() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        boolean b = true;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        Assertions.assertEquals(60, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsGreaterThan61ThenReturnSumOfNAnd50() {
        // Arrange
        MyService myService = new MyService();
        int n = 70;
        boolean b = true;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        Assertions.assertEquals(120, result);
    }

    @Test
    public void testDetermineValueWhenBIsFalseThenReturnSumOfNAnd50() {
        // Arrange
        MyService myService = new MyService();
        int n = 30;
        boolean b = false;
        String value = null;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        Assertions.assertEquals(80, result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullThenReturnSumOfNAnd50MinusLengthOfValue() {
        // Arrange
        MyService myService = new MyService();
        int n = 40;
        boolean b = true;
        String value = "test";

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        Assertions.assertEquals(86, result);
    }
}