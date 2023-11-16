package org.comparison.average.e10;

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
        String actualResult = testedInstance.determineValue("_", "anyvalue", 2, 2);
        Assertions.assertEquals("anyvalue", actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("_______", "anyvalue", 14, 2);
        Assertions.assertEquals("num", actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("_______", "anyvalue", 17, 1);
        Assertions.assertEquals("_______", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("_______", "anyvalue", 19, 1);
        Assertions.assertEquals("27_", actualResult);
    }

}

