package org.comparison.complex.e06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link MyService} class.
 *
 * @author Didro
 */
public class TestMyService {

    @Test
    public void testDetermineValue_8() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(26, true, null);
        Assertions.assertEquals(120, actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(2, false, "________");
        Assertions.assertEquals(280, actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(2, false, null);
        Assertions.assertEquals(200, actualResult);
    }

    @Test
    public void testDetermineValue_1() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(9, true, "________");
        Assertions.assertEquals(230, actualResult);
    }

    @Test
    public void testDetermineValue_5() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(9, true, null);
        Assertions.assertEquals(150, actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(18, true, "________");
        Assertions.assertEquals(260, actualResult);
    }

    @Test
    public void testDetermineValue_7() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(18, true, null);
        Assertions.assertEquals(180, actualResult);
    }

    @Test
    public void testDetermineValue_6() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(26, true, "________");
        Assertions.assertEquals(200, actualResult);
    }

}

