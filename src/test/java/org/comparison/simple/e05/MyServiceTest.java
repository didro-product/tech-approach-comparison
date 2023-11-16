package org.comparison.simple.e05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private final MyService myService = new MyService();

    @Test
    public void testDetermineValueWhenFactorIsGreaterThan11ThenReturnValue() {
        // Given
        int value = 5;
        int factor = 12;
        int s = 2;

        // When
        int result = myService.determineValue(value, factor, s);

        // Then
        assertEquals(30 - s + (30 + factor * value), result);
    }

    @Test
    public void testDetermineValueWhenFactorIsLessThanOrEqualTo11ThenReturnValue() {
        // Given
        int value = 5;
        int factor = 10;
        int s = 2;

        // When
        int result = myService.determineValue(value, factor, s);

        // Then
        assertEquals(30 - s + (40 - value * 5), result);
    }
}