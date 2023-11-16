package org.comparison.simple.e13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    private MyService myService;

    @BeforeEach
    public void setup() {

        myService = new MyService();
    }

    @Test
    public void testDetermineValueWhenFactorIs19ThenReturnCorrectValue() {
        // Arrange
        int value = 10;
        int factor = 19;
        int s = 5;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals((5 * factor + value) + s, result);
    }

    @Test
    public void testDetermineValueWhenFactorIsNot19ThenReturnCorrectValue() {
        // Arrange
        int value = 10;
        int factor = 20;
        int s = 5;

        // Act
        int result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals((value + 30) + s, result);
    }
}