package org.comparison.complex.e09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link MyService} class.
 *
 * @author Didro
 */
public class TestMyService {

    @Test
    public void testDetermineValue_5() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(41, true, null);
        Assertions.assertEquals(58, actualResult);
    }

    @Test
    public void testDetermineValue_1() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(41, true, "________");
        Assertions.assertEquals(66, actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(20, true, "________");
        Assertions.assertEquals(88, actualResult);
    }

    @Test
    public void testDetermineValue_7() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(20, true, null);
        Assertions.assertEquals(80, actualResult);
    }

    @Test
    public void testDetermineValue_6() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(31, true, "________");
        Assertions.assertEquals(53, actualResult);
    }

    @Test
    public void testDetermineValue_8() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(31, true, null);
        Assertions.assertEquals(45, actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(2, false, "________");
        Assertions.assertEquals(12, actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(2, false, null);
        Assertions.assertEquals(4, actualResult);
    }

}

