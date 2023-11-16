package org.comparison.simple.e15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MyServiceTest {

    private MyService myService;

    @BeforeEach
    public void setUp() {

        myService = new MyService();
    }

    @Test
    public void testDetermineValueWhenFactorGreaterThan7ThenReturnProductOfSAndD() {
        // Arrange
        int value = 3;
        int factor = 8;
        int s = 2;
        int expected = s * (5 * factor + value);

        // Act
        int actual = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDetermineValueWhenFactorLessThanOrEqualTo7ThenReturnProductOfSAndD() {
        // Arrange
        int value = 3;
        int factor = 7;
        int s = 2;
        int expected = s * (value * 2 + 5);

        // Act
        int actual = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals(expected, actual);
    }
}