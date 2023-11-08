package org.comparison.e16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link MyService} class.
 *
 * @author Didro
 */
public class TestMyService {

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, 16, 2);
        Assertions.assertEquals("10d22d2", actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, 9, 2);
        Assertions.assertEquals("10_76_2", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, 13, 2);
        Assertions.assertEquals("10_10_2", actualResult);
    }

}

