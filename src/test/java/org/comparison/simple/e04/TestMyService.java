package org.comparison.simple.e04;

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
        String actualResult = testedInstance.determineValue(2, 2, "anyvalue");
        Assertions.assertEquals("anyvalue2102", actualResult);
    }

    @Test
    public void testDetermineValue_1() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, 13, "anyvalue");
        Assertions.assertEquals("anyvalue224", actualResult);
    }

}

