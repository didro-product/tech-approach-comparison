package org.comparison.e05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {

    @Test
    public void testDetermineValueWhenFirstArgGreaterThan25AndDefaultPassLengthLessThan8ThenReturnConcatenationOfCoefAndFirstArg() {
        // Arrange
        MyService myService = new MyService();
        int firstArg = 26;
        String defaultPass = "pass";
        int adaptedSize = 10;
        int factor = 2;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("coef26", result);
    }

    @Test
    public void testDetermineValueWhenFirstArgLessThanOrEqualTo25AndDefaultPassLengthGreaterThanOrEqualTo8ThenReturnConcatenationOfCoefAndDefaultPass() {
        // Arrange
        MyService myService = new MyService();
        int firstArg = 25;
        String defaultPass = "password";
        int adaptedSize = 10;
        int factor = 2;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("coefpassword", result);
    }

    @Test
    public void testDetermineValueWhenFirstArgLessThanOrEqualTo25AndDefaultPassLengthLessThan8AndAdaptedSizePlus10TimesFactorGreaterThanOrEqualTo40ThenReturnConcatenationOfCoefHyphenAndAdaptedSize() {
        // Arrange
        MyService myService = new MyService();
        int firstArg = 25;
        String defaultPass = "pass";
        int adaptedSize = 35;
        int factor = 1;

        // Act
        String result = myService.determineValue(firstArg, defaultPass, adaptedSize, factor);

        // Assert
        assertEquals("coef-35", result);
    }
}