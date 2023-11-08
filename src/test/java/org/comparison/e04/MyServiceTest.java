package org.comparison.e04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    private MyService myService = new MyService();

    @Test
    public void testDetermineValueWhenFirstArgLengthIs8ThenReturnCoefPlusFirstArg() {

        String firstArg = "12345678";
        String defaultPass = "default";
        int adaptedSize = 10;
        int factor = 2;

        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        assertEquals("coef12345678", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeGreaterThan19AndCalculatedValueLessThan40ThenReturnCoefPlusCalculatedValue() {

        String firstArg = "1234567";
        String defaultPass = "default";
        int adaptedSize = 20;
        int factor = 1;

        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        assertEquals("coef30", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeGreaterThan19AndCalculatedValueGreaterThanOrEqualTo40ThenReturnCoefPlusAdaptedSize() {

        String firstArg = "1234567";
        String defaultPass = "default";
        int adaptedSize = 20;
        int factor = 3;

        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        assertEquals("coef20", result);
    }

    @Test
    public void testDetermineValueWhenAdaptedSizeLessThanOrEqualTo19ThenReturnCoefPlusDefaultPass() {

        String firstArg = "1234567";
        String defaultPass = "default";
        int adaptedSize = 10;
        int factor = 2;

        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        assertEquals("coefdefault", result);
    }
}