package org.comparison.complex.e08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(Lifecycle.PER_METHOD)
public class MyServiceTest {

    private MyService myService;

    @BeforeEach
    public void setUp() {

        myService = new MyService();
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsLessThan10ThenReturn45() {

        int n = 5;
        boolean b = true;
        String value = null;
        int result = myService.determineValue(n, b, value);
        assertEquals(45, result);
    }

    @Test
    public void testDetermineValueWhenBIsTrueAndNIsGreaterThan75ThenReturn120() {

        int n = 80;
        boolean b = true;
        String value = null;
        int result = myService.determineValue(n, b, value);
        assertEquals(120, result);
    }

    @Test
    public void testDetermineValueWhenBIsFalseThenReturn45() {

        int n = 5;
        boolean b = false;
        String value = null;
        int result = myService.determineValue(n, b, value);
        assertEquals(45, result);
    }

    @Test
    public void testDetermineValueWhenValueIsNotNullThenReturn65() {

        int n = 5;
        boolean b = true;
        String value = "test";
        int result = myService.determineValue(n, b, value);
        assertEquals(75, result);
    }

    @Test
    public void testDetermineValueWhenValueIsEmptyThenReturn45() {

        int n = 5;
        boolean b = true;
        String value = "";
        int result = myService.determineValue(n, b, value);
        assertEquals(45, result);
    }
}