package org.comparison.average.e03;

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
        String actualResult = testedInstance.determineValue("______", "anyvalue", 2, 2);
        Assertions.assertEquals("coef______", actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("___", "anyvalue", 16, 2);
        Assertions.assertEquals("coefanyvalue", actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("___", "anyvalue", 14, 2);
        Assertions.assertEquals("coef28", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("___", "anyvalue", 14, 1);
        Assertions.assertEquals("coef14", actualResult);
    }

}

