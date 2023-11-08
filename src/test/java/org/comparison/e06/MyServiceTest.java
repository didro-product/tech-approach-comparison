package org.comparison.e06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    private final MyService myService = new MyService();

    @Test
    @DisplayName("Test the 'if' branch where the 'firstString' parameter is equal to 'fail'")
    public void testDetermineValueWhenFirstStringIsFailThenReturnNumPass() {

        String firstString = "fail";
        String defaultPass = "pass";
        int adaptedSize = 20;
        int factor = 5;

        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        Assertions.assertEquals("numpass", result);
    }

    @Test
    @DisplayName("Test the 'if' branch where the 'adaptedSize' parameter is greater than 25")
    public void testDetermineValueWhenAdaptedSizeIsGreaterThan25ThenReturnNumPass() {

        String firstString = "pass";
        String defaultPass = "pass";
        int adaptedSize = 30;
        int factor = 5;

        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        Assertions.assertEquals("1_", result);
    }

    @Test
    @DisplayName("Test the 'else' branch where the 'adaptedSize' parameter is less than or equal to 25")
    public void testDetermineValueWhenAdaptedSizeIsLessThanOrEqualTo25ThenReturnPassNum() {

        String firstString = "pass";
        String defaultPass = "pass";
        int adaptedSize = 20;
        int factor = 5;

        String result = myService.determineValue(firstString, defaultPass, adaptedSize, factor);

        Assertions.assertEquals("passnum", result);
    }
}