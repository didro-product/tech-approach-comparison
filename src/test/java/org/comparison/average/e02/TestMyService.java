package org.comparison.average.e02;

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
        String actualResult = testedInstance.determineValue("anyvalue", "anyvalue", 10, 2);
        Assertions.assertEquals("coefanyvalue", actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("anyvalue", "anyvalue", 18, 2);
        Assertions.assertEquals("coefanyvalue", actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("anyvalue", "anyvalue", 20, 5);
        Assertions.assertEquals("coef100", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue("anyvalue", "anyvalue", 20, 3);
        Assertions.assertEquals("coef20", actualResult);
    }

}

