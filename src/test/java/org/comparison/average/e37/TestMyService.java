package org.comparison.average.e37;

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
        int actualResult = testedInstance.determineValue(2, true, null);
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(2, false, "________");
        Assertions.assertEquals(-7, actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(2, true, "________");
        Assertions.assertEquals(-18, actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(4, true, "________");
        Assertions.assertEquals(-5, actualResult);
    }

}

