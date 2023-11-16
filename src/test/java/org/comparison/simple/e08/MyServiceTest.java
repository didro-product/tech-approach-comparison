package org.comparison.simple.e08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFactorIsGreaterThanOrEqualTo50ThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 50;
        String s = "test";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals("1070test", result);
    }

    @Test
    public void testDetermineValueWhenFactorIsLessThan50ThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 40;
        String s = "test";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals("76test", result);
    }

    @Test
    public void testDetermineValueWhenValueIsNegativeThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        int value = -10;
        int factor = 50;
        String s = "test";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals("970test", result);
    }

    @Test
    public void testDetermineValueWhenStringIsEmptyThenReturnValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 50;
        String s = "";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals("1070", result);
    }

    @Test
    public void testDetermineValueWhenStringIsNullThenReturnNullPointerException() {
        // Arrange
        MyService myService = new MyService();
        int value = 10;
        int factor = 50;
        String s = null;

        // Act & Assert
        assertThrows(NullPointerException.class, () -> myService.determineValue(value, factor, s));
    }
}