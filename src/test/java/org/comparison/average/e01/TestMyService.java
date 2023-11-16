package org.comparison.average.e01;

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
        String actualResult = testedInstance.determineValue(113, "anyvalue", 2, 2);
        Assertions.assertEquals("45anyvalue", actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, "anyvalue", 13, 2);
        Assertions.assertEquals("anyvalue45", actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(1, "anyvalue", 30, 2);
        Assertions.assertEquals("451", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(3, "anyvalue", 30, 2);
        Assertions.assertEquals("3_anyvalue", actualResult);
    }

}

