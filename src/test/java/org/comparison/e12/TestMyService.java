package org.comparison.e12;

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
        String actualResult = testedInstance.determineValue(2, 9, 2);
        Assertions.assertEquals("10d13d5d26", actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, 16, 2);
        Assertions.assertEquals("10_10_12_26", actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, 13, 2);
        Assertions.assertEquals("10d-312d338d26", actualResult);
    }

}

