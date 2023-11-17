package org.comparison.complex.e07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests for {@link MyService} class.
 *
 * @author Didro
 */
public class TestMyService {

    @Test
    public void testDetermineValue_7() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(38, true, null);
        Assertions.assertEquals(390, actualResult);
    }

    @Test
    public void testDetermineValue_6() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(14, true, "________");
        Assertions.assertEquals(20, actualResult);
    }

    @Test
    public void testDetermineValue_8() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(14, true, null);
        Assertions.assertEquals(28, actualResult);
    }

    @Test
    public void testDetermineValue_2() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(2, false, "________");
        Assertions.assertEquals(4, actualResult);
    }

    @Test
    public void testDetermineValue_4() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(2, false, null);
        Assertions.assertEquals(12, actualResult);
    }

    @Test
    public void testDetermineValue_1() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(61, true, "________");
        Assertions.assertEquals(78, actualResult);
    }

    @Test
    public void testDetermineValue_5() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(61, true, null);
        Assertions.assertEquals(86, actualResult);
    }

    @Test
    public void testDetermineValue_3() {

        MyService testedInstance = new MyService();
        int actualResult = testedInstance.determineValue(38, true, "________");
        Assertions.assertEquals(382, actualResult);
    }

}

