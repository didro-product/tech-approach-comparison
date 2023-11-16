package org.comparison.simple.e16;

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
        String actualResult = testedInstance.determineValue(2, 29, "anyvalue");
        Assertions.assertEquals("anyvalue88", actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, 31, "anyvalue");
        Assertions.assertEquals("anyvalue28", actualResult);
    }

}

