package org.comparison.average.e07;

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
    public void testDetermineValueWhenFirstStringIsFailThenReturnNumPass() {

        String firstString = "fail";
        String defaultPass = "pass";
        int adaptedSize = 5;
        int factor = 2;

        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        Assertions.assertEquals("numpass", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeIsGreaterThan10AndNIsGreaterThan6ThenReturnFirstString() {

        String firstString = "test";
        String defaultPass = "pass";
        int adaptedSize = 20;
        int factor = 10;

        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        Assertions.assertEquals(firstString, result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeIsGreaterThan10AndNIsLessThanOrEqualTo6ThenReturnN_() {

        String firstString = "test";
        String defaultPass = "pass";
        int adaptedSize = 20;
        int factor = 50;

        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        Assertions.assertEquals("7_", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeIsLessThanOrEqualTo10ThenReturnDefaultPass() {

        String firstString = "test";
        String defaultPass = "pass";
        int adaptedSize = 5;
        int factor = 2;

        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        Assertions.assertEquals(defaultPass, result);
    }
}