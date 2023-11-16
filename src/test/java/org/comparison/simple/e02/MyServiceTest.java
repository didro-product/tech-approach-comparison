package org.comparison.simple.e02;

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
    public void testDetermineValueWhenStringLengthIsLessThan5ThenReturnValue() {
        // Arrange
        int value = 2;
        int factor = 3;
        String s = "abc";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("abc38", result, "The returned value is not as expected when the length of the input string is less than 5");
    }

    @Test
    public void testDetermineValueWhenStringLengthIsGreaterThanOrEqualTo5ThenReturnValue() {
        // Arrange
        int value = 2;
        int factor = 3;
        String s = "abcde";

        // Act
        String result = myService.determineValue(value, factor, s);

        // Assert
        Assertions.assertEquals("abcde312", result, "The returned value is not as expected when the length of the input string is greater than or equal to 5");
    }
}