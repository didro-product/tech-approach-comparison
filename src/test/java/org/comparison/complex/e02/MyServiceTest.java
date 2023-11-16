package org.comparison.complex.e02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenValueIsNullAndNGreaterThan25ThenReturn10PlusN() {
        // Arrange
        MyService myService = new MyService();
        int n = 30;
        boolean b = false;
        String value = null;

        // Act
        String result = myService.determineValue(n, b, value);

        // Assert
        assertEquals("40null30", result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullAndNLessThan10ThenReturn10Times3() {
        // Arrange
        MyService myService = new MyService();
        int n = 5;
        boolean b = true;
        String value = "test";

        // Act
        String result = myService.determineValue(n, b, value);

        // Assert
        assertEquals("30test5", result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullAndNGreaterThanOrEqualTo10ThenReturnN() {
        // Arrange
        MyService myService = new MyService();
        int n = 10;
        boolean b = true;
        String value = "test";

        // Act
        String result = myService.determineValue(n, b, value);

        // Assert
        assertEquals("10test10", result);
    }
}