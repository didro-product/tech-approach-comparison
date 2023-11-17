package org.comparison.complex.e10;

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
        int actualResult = testedInstance.determineValue(19, true, "________");
        Assertions.assertEquals(96, actualResult);
    }

    @Test
    public void testDetermineValue_5() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(19, true, null);
        Assertions.assertEquals(104, actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(62, true, "________");
        Assertions.assertEquals(128, actualResult);
    }

    @Test
    public void testDetermineValue_7() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(62, true, null);
        Assertions.assertEquals(136, actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(2, false, "________");
        Assertions.assertEquals(44, actualResult);
    }

    @Test
    public void testDetermineValue_6() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(41, true, "________");
        Assertions.assertEquals(93, actualResult);
    }

    @Test
    public void testDetermineValue_8() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(41, true, null);
        Assertions.assertEquals(101, actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(2, false, null);
        Assertions.assertEquals(52, actualResult);
    }

}

