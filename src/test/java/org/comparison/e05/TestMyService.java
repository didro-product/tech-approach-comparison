package org.comparison.e05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link MyService} class.
 *
 * @author Didro
 */
public class TestMyService {

    @Test
    public void testDetermineValue_1() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(26, "anyvalue", 2, 2);
        Assertions.assertEquals("coef26", actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(24, "____", 2, 2);
        Assertions.assertEquals("coef____", actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(24, "_________", 29, 1);
        Assertions.assertEquals("coef39", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(24, "_________", 31, 1);
        Assertions.assertEquals("coef-31", actualResult);
    }

}

