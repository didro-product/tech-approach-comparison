package org.comparison.simple.e03;

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
        String actualResult = testedInstance.determineValue(2, 5, "anyvalue");
        Assertions.assertEquals("5anyvalue11", actualResult);
    }

    @Test
    public void testDetermineValue_1() {

        MyService testedInstance = new MyService();
        String actualResult = testedInstance.determineValue(2, 7, "anyvalue");
        Assertions.assertEquals("5anyvalue-9", actualResult);
    }

}

