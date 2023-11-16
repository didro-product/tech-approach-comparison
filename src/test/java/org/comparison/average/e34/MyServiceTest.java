package org.comparison.average.e34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenValueNotNullAndBooleanFalseThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        String value = "test";
        boolean b = false;
        int n = 0;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        Assertions.assertEquals(5 + value.length() + 20, result);
    }

    @Test
    public void testDetermineValueWhenValueNullAndBooleanTrueAndNLessThan50ThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        String value = null;
        boolean b = true;
        int n = 49;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        Assertions.assertEquals(10 + 20, result);
    }

    @Test
    public void testDetermineValueWhenValueNullAndBooleanTrueAndNGreaterThanOrEqualTo50ThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        String value = null;
        boolean b = true;
        int n = 50;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        Assertions.assertEquals(20 / 4 - n, result);
    }

    @Test
    public void testDetermineValueWhenValueNullAndBooleanFalseThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        String value = null;
        boolean b = false;
        int n = 0;

        // Act
        int result = myService.determineValue(n, b, value);

        // Assert
        Assertions.assertEquals(20 / 4 - n, result);
    }
}