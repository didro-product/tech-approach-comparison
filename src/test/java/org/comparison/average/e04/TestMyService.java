package org.comparison.average.e04;

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
        String actualResult = testedInstance.determineValue("________", "anyvalue", 2, 2);
        Assertions.assertEquals("coef________", actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("_", "anyvalue", 18, 2);
        Assertions.assertEquals("coefanyvalue", actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("_", "anyvalue", 29, 1);
        Assertions.assertEquals("coef39", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("_", "anyvalue", 31, 1);
        Assertions.assertEquals("coef31", actualResult);
    }

}

