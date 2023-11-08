package org.comparison.e14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link MyService} class.
 *
 * @author Didro
 */
public class TestMyService {

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(9, 32, 2);
        Assertions.assertEquals("10a293a5a26", actualResult);
    }

    @Test
    public void testDetermineValue_1() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(11, 32, 2);
        Assertions.assertEquals("10_28_21_26", actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(11, 2, 2);
        Assertions.assertEquals("10_10_21_26", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(9, 2, 2);
        Assertions.assertEquals("10a42a24a26", actualResult);
    }

}

