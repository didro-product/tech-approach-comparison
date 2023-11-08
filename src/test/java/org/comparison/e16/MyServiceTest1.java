package org.comparison.e16;

import org.junit.jupiter.api.Test;

public class MyServiceTest1 {

    @Test
    public void testDetermineValueWhenFactorLessThan10ThenReturnStringWith10AndValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 9;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
//        assertThat(result).startsWith("10_").endsWith("_" + value);
    }

    @Test
    public void testDetermineValueWhenFactorBetween10And15ThenReturnStringWith10AndValue() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 12;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
//        assertThat(result).startsWith("10_").endsWith("_" + value);
    }

    @Test
    public void testDetermineValueWhenFactorGreaterThan15ThenReturnStringWith10AndValueMultipliedByFactorMinus10() {
        // Arrange
        MyService myService = new MyService();
        int value = 5;
        int factor = 16;
        int b = 0;

        // Act
        String result = myService.determineValue(value, factor, b);

        // Assert
//        assertThat(result).startsWith("10d").endsWith("d" + (value * factor - 10));
    }
}