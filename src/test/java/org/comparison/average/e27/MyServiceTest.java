package org.comparison.average.e27;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenValueLengthLessThan16AndNNotEqual54ThenReturn4TimesA() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        String value = "test";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        Assertions.assertEquals(4 * 20, result);
    }

    @Test
    public void testDetermineValueWhenValueLengthGreaterThanOrEqualTo16AndNNotEqual54ThenReturn3TimesAPlusN() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        String value = "thisIsAReallyLongValue";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        Assertions.assertEquals(3 * 6 * value.length() + n, result);
    }

    @Test
    public void testDetermineValueWhenNIsEqual54AndValueLengthLessThan16ThenReturn4TimesA() {
        // Arrange
        MyService myService = new MyService();
        int n = 54;
        String value = "test";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        Assertions.assertEquals(4 * 20, result);
    }

    @Test
    public void testDetermineValueWhenNIsEqual54AndValueLengthGreaterThanOrEqualTo16ThenReturnNPlus23() {
        // Arrange
        MyService myService = new MyService();
        int n = 54;
        String value = "thisIsAReallyLongValue";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        Assertions.assertEquals(n + 23, result);
    }

    @Test
    public void testDetermineValueWhenNIsEqual54ThenReturnNPlus23() {
        // Arrange
        MyService myService = new MyService();
        int n = 54;
        String value = "test";

        // Act
        int result = myService.determineValue(n, value);

        // Assert
        Assertions.assertEquals(n + 23, result);
    }
}