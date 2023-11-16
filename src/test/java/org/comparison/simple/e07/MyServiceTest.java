package org.comparison.simple.e07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    private MyService myService;

    @BeforeEach
    public void setUp() {

        myService = new MyService();
    }

    @Test
    public void testDetermineValueWhenFactorIsFiveThenReturnCorrectValue() {
        // Arrange
        int value = 2;
        int factor = 5;
        int s = 0;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals(-10, result);
    }

    @Test
    public void testDetermineValueWhenFactorIsNotFiveThenReturnCorrectValue() {
        // Arrange
        int value = 2;
        int factor = 3;
        int s = 0;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals(-10, result);
    }
}