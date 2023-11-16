package org.comparison.average.e08;

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
        String actualResult = testedInstance.determineValue("fail", "anyvalue", 2, 2);
        Assertions.assertEquals("numanyvalue", actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("________", "anyvalue", 15, 2);
        Assertions.assertEquals("anyvalue", actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("________", "anyvalue", 168, 2);
        Assertions.assertEquals("________", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("________", "anyvalue", 148, 2);
        Assertions.assertEquals("15_", actualResult);
    }

}

