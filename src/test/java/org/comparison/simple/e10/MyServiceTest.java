package org.comparison.simple.e10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private MyService myService;

    @BeforeEach
    public void setUp() {

        myService = new MyService();
    }

    @Test
    public void testDetermineValueWhenFactorLessThan10ThenReturnCorrectValue() {
        // Arrange
        int value = 5;
        int factor = 2;
        int s = 100;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals(51, result);
    }

    @Test
    public void testDetermineValueWhenFactorGreaterThanOrEqualTo10ThenReturnCorrectValue() {
        // Arrange
        int value = 5;
        int factor = 10;
        int s = 100;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        assertEquals(50, result);
    }
}